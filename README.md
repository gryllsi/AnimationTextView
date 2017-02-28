#demo
![image](/screenshot/2017-02-21_15_57_37.gif)
# usage
Add dependencies in build.gradle:
```
 dependencies {
       compile 'com.totcy.widget:textviewlibrary:1.0.0'
    }
```
Or Maven:
```
<dependency>
  <groupId>com.totcy.widget</groupId>
  <artifactId>textviewlibrary</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```
java:
```
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (AnimationTextView) findViewById(R.id.tv_test);
        textView.postDelayed(new Runnable() {
            @Override
            public void run() {
                textView.setMaxNum(4000);
            }
        }, 1000);
    }
```