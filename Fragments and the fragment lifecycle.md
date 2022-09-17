- A fragment is simply a reusable piece of your app's user interface.
- Like activities, fragments have a lifecycle and can respond to user input.
- A fragment is always contained within the view hierarchy of an activity when it is shown onscreen.
- Due to their emphasis on reusability and modularity, it's even possible for multiple fragments to be hosted simultaneously by a single activity. Each fragment manages its own separate lifecycle.

## Fragment lifecycle
- Like activities, fragments can be initialized and removed from memory, and throughout their existence, appear, disappear, and reappear onscreen.
- Also, just like activities, fragments have a lifecycle with several states, and provide several methods you can override to respond to transitions between them.
-  The fragment lifecycle has five states,
		- **INITIALIZED**:  A new instance of the fragment has been instantiated.
		- **CREATED**:   The first fragment lifecycle methods are called. During this state, the view associated with the fragment is also created.
		- **STARTED**:  The fragment is visible onscreen but does not have "focus", meaning it can't respond to user input.
		-**RESUMED**: The fragment is visible and has focus.
		- **DESTROYED**: The fragment object has been de-instantiated.

Also similar to activities, the [`Fragment`](https://developer.android.com/reference/android/app/Fragment) class provides many methods that you can override to respond to lifecycle events.
-   `onCreate()`: The fragment has been instantiated and is in the `CREATED` state. However, its corresponding view has not been created yet.
-   `onCreateView()`: This method is where you inflate the layout. The fragment has entered the `CREATED` state.
-   `onViewCreated()`: This is called after the view is created. In this method, you would typically bind specific views to properties by calling `findViewById()`.
-   `onStart()`: The fragment has entered the `STARTED` state.
-   `onResume()`: The fragment has entered the `RESUMED` state and now has focus (can respond to user input).
-   `onPause()`: The fragment has re-entered the `STARTED` state. The UI is visible to the user
-   `onStop()`: The fragment has re-entered the `CREATED` state. The object is instantiated but is no longer presented on screen.
-   `onDestroyView()`: Called right before the fragment enters the `DESTROYED` state. The view has already been removed from memory, but the fragment object still exists.
-   `onDestroy()`: The fragment enters the `DESTROYED` state.