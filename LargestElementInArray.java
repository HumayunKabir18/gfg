class Compute {
    
    public int largest(int arr[], int n)
    {
        int x =Arrays.stream(arr).max().getAsInt();
        return x;
    }
}
