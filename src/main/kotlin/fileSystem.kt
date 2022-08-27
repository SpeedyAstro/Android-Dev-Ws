/*
1. Start from manifest.xml file
    -> every andriod app has an andriodmenifest.xml file
    -> this file contains information that a device needs in order to run the app
    -> this xml file acts as an intermediator between andriod os and application, when a user taps on app icon andriod operating system firstly reaches to andriodmenifest.xml file
    -> using the information avaialble in andriod menifest xml file system decides what activity to open first
    -> it also contains package details of application "com.example..."
    -> if we are writing codes to deal with rest api we need to provide permission to use internet connection
2. Java folder
    -> this folder contains all the source code files created during the development
    -> for eg. kotlins files
    -> it has three subfolders - 1. source code files 2.&3. are used to store test files (instrumented testing & manual testing)
3.  java generated classes
    - all the time andriod studio will generates lot of classes for us to make our life easier , whenever we use supporting libraries to save time
4. res folder
    -> this folder contains all non - code resources , doesn't contains kotlin files , but all the other related resource files of app like xml layout files , string resources and bitmap resources
    -> this folder also divided into 4 sub-folders named drawable , layout , mipmap and values
    -> drawable subfolder inside the res folder contains all the different types of images used in developement , (also xml files of images)
    -> layout subfolder -> inside it contains all the xml layout files such as "activity_main" , this layout files create the view of the screen with contains buttons, textview, dropdown
5. mipmap folder
    -> this folder also contains images , but different icons files used in thm (in different sizes of icons for different size of device)
6. values folder
    -> contains xml files to hold different default values like colors.xml (whenever we use this color inside the app we don't have to type hexadecimal values instead we can refer to using names defined in the color.xml file , and there is another string.xml file (when we creating applications we define all the strings inside the string.xml file whenever we need to change those string in future we dont have to read all the code instead change on string.xml
    -> single string in string.xml file can be used many times
7. theme folder
    -> this folder contains details about the theme of the project
    -> also add custom xml files in themes folder
8. Gradle Scripts
    -> gradle scripts are very important , it is a automated build system so because of greadle we dont have to manually do different configurations and different libraries and organize them to specific folder
    -> first two gradle files (project , module)
    -> project one called as project level gradle file , for dependencies
    -> module one called app level gradle file , it used most of time , whenever we need new plugin it define it here
    -------------------------------------------------------------------------------------------

 mainActivity.kt -> kotlins files are view controller (like activity_main.xml is a view) , it contains instruction which controls that view
 activity_main.xml -> it a view file , (like html)
 */