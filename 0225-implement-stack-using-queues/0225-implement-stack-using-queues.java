class MyStack {
  Queue<Integer> q = new LinkedList<>();
    public MyStack() {
        
    }
     //this is remove() and peek() efficient approach-->>>
    
    public void push(int x) {  //0(n)
        q.add(x);
         int n = q.size();
        for(int i= 0;i<n-1;i++){
            q.add(q.remove());
        }
    }
    
    public int pop() {  // 0(1)
     return  q.remove();
    }


     public int top() { //O(1)
       
     return q.peek();
       
    }
    
    public boolean empty() {
        return q.size()==0;
    }
}

    //this is add() efficient approach-->>>

    // public void push(int x) {  //0(1)
    //     q.add(x);
    // }
    
    // public int pop() {  // 0(n)
    //     int n = q.size();
    //     for (int i= 0;i<n-1;i++){
    //        q.add(q.remove());
    //     }
    //      return  q.remove();
    // }

    //      public int top() { //O(n)
    //     int n = q.size();
    //      for (int i= 0;i<n-1;i++){
    //     q.add(q.remove());
    //  }
    //     int f = q.peek();
    //      q.add(q.remove());  //imp -->> wh need to add back to queue;
    //      return f;
    // }
    
    // public boolean empty() {
    //     return q.size()==0;
    // }

