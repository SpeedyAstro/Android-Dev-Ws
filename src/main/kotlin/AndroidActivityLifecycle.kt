//when we open android application system create an instance of the launch activity in the memory
/*
we learned about launch activity earlier , the android manifest.xml file
in the "hellofromAndroid" project launch activity os the main activity
when we install and open this application in the phone the android system will create an instance of main activity.kt class in the memory
that can be considered as a birth of the main activity instance
technically this process is called as launch of Main activity instance
and these new activity instance will have to spend time in different life cycle stages before it finally become dead , not just the launch activity all the activities and fragments of android have lifecycles
- activity life cycle , fragment life cycle
fragment life cycle is almost similar to activity life cycle
android system doing this lifecycles changes to the activity instance considering the users and environment requirements
as an example if the user open another app while using our app then android system has to move current activity of our app to post state and move the application to background
after user back to app system will take aur app to foreground and transit the activity from force state back to resume state, to recognize state transit
we can use set of overridden lifecycles callback functions provided by activity class
these callback functions allow the activity to know the system is creating stopping or resuming an activity or destroying the process in which the activity resides
we can use those function to write codes to perform a specific task required to given change of state . it is very important for the smooth performance of our app and that will make our app more user-friendly
as an example let's say in one activity of power app we displaying a video file to the user then think what will happen when user click on another activity then the current activity (video playing) should stop/pause
we can use one force callback function .
so here we have a simplified gestation of the activity lifecycle -:
    1. when we launch the activity firstly it comes to create state at that time android system will invoke activity instances on create call back function
    in onCreate function we perform basic application startup logic that should happen only once for the entire life of the activity, this is the must have func
    that's why when we create a new activity class android studio creates this functions
    overriding onCreate function is compulsory you mus have an onCreate function in an activity actually that is the only compulsory lifecycle function , all other lifecycle functions are optional , we dont have to override them unless we need to use them
    actually when we create an activity we extent app compact activity class , if we check the class hierarchy of it app compact activity class <image??>
 */