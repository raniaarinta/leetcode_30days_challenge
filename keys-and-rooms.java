class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] open_room = new boolean[rooms.size()];
        open_room[0]=true;

        Stack<Integer> key = new Stack();
        key.add(0);
        while(! key.isEmpty())
        {
            int get_current= key.pop();
            for(int new_key: rooms.get(get_current))
            {
                if(! open_room[new_key])
                {
                    open_room[new_key]=true;
                    key.add(new_key);
                }
            }
        }





        //check to see if the room already open or not
        for(boolean visit: open_room)
        {
            if(!visit)
            {
                return false;
            }

        }
        return true;
        
    }
}