class Solution {
    public int countCollisions(String directions) {
        int n = directions.length();
        int left = 0;
        int right = n - 1;
        while (left < n && directions.charAt(left) == 'L') left++;
        // this is becouse if the left side left directions car are there then they dont collide becouse the are in same direction and same speed so we dont count them....
        while (right >= 0 && directions.charAt(right) == 'R') right--;
        // this is becouse if the right cars move right direction in same speed the it dont collide so we ignore that cars

        //now time to count how many collision that happen if the cars are in differnt direction moving then they collide and 2 collision happen and after the they cant move and the car are stay in place fi some car are collide then collision is one so we have to count that,...
        int collision = 0;
        for (int i = left; i <= right; i++) {
            if (directions.charAt(i) != 'S') {
                collision++;
                // this is becouse if left car moving car colide each car count 1 collision so if two moving car collide then two collision count but if stationary car collide it count one collision ... so if there is left or right direction car the we count one if stationary car we cant count it.....
            }
        }
        return collision;
    }
}