
class MyCalendar {

    ArrayList<ArrayList<Integer>> arr; 
    
    public MyCalendar() {
        arr = new ArrayList<>();    
    }

    // Sorting method, if needed
    private static void sortArrayList(ArrayList<ArrayList<Integer>> arr) {
        Collections.sort(arr, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> list1, ArrayList<Integer> list2) {
                return Integer.compare(list1.get(0), list2.get(0));
            }
        });
    }
    
    public boolean book(int start, int end) {
        for (ArrayList<Integer> temp : arr) {
            int existingStart = temp.get(0);
            int existingEnd = temp.get(1);
            // Check if there's an overlap
            if (!(end <= existingStart || start >= existingEnd)) {
                return false; // Overlap detected, cannot book
            }
        }
        // If no overlap, add the booking
        ArrayList<Integer> newBooking = new ArrayList<>();
        newBooking.add(start);
        newBooking.add(end);
        arr.add(newBooking);

        // Optional: Sort the list, though not required in this method
        sortArrayList(arr);
        
        return true; // Booking successful
    }
}