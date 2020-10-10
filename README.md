# SigTupleAssignment

## Requirements for running the application

- Make sure you have Maven and Java JDK 11 installed.

## Running the application

- execute ```mvn clean install``` in the terminal to compile the application and run the test cases

- execute ```java -cp java -cp target/SigTupleAssigment-1.0-SNAPSHOT.jar com.sig.tuple.SigTupleAssignmentApplication```  in the terminal to run the application


The Following is the psuedo code for Question 3
```
Class App implements Comparable<App>{
  String name;
  long lastUsedTimestamp;
  long usedCount;
}

class AppLastUsedComparator implements Comparator<App> 
{ 
    public int compare(App app1, App app2) 
    { 
        if (app1.getLastUsedTimestamp() < m2.getLastUsedTimestamp) return -1; 
        if (m1.getLastUSedTimestamp() > m2.getLastUsedTimestamp()) return 1; 
        else return 0; 
    } 
}
  
class AppUsageFreuencyComparator implements Comparator<App> 
{ 
    public int compare(App app1, App app2) 
    { 
        if (app1.getUsedCount() < m2.getUsedCount) return 1; 
        if (m1.getUSedCount() > m2.getUsedCount) return -1; 
        else return 0; 
    } 
}
```  
Implement a priority queue which also has a map of the the app name to the instance of the App.
On insert checks if the heap contains the instance of the app,
if the heap contains an instance of the app it refreshes the heap.
If the queue does not contain an instance of the app it will add the element to the heap and the map. 
```
global PriorityQueueWithHashMap<App> lastUsedQueue = new PriorityQueueWithHashMap<App>();
global PriorityQueueWithHashMap<App> frequencyQueue = new PriorityQueueWithHashMap<App>();  


recently_used_apps(String name_of_app_opened) {
     lastUsedQueue.insert(name_of_app_opened);
     List<App> fiveRecentlyUsedApps = new ArrayList<App>();
     Iterator lastUsedQueueIterator = lastUsedQueue.iterator();
     int counter =0;
     while(counter<5){
        fiveRecentlyUsedApps.add(lasUsedQueueIterator.next());
        counter++;
     }
     return fiveRecentlyUsedApps;
  }
  
  frequently_used_apps(String(String name_of_app_opened) {
     frequencyQueue.insert(name_of_app_opened);
     List<App> fiveFrequentlyUsedApps = new ArrayList<App>();
     Iterator frequencyQueueIterator = frequencyQueue.iterator();
     int counter =0;
     while(counter<5){
        fiveFrequentlyUsedApps.add(frequencyQueueIterator.next());
        counter++;
     }
     return fiveFrequentlyUsedApps;
  }
```
  



