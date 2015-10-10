# chopsticks [![Release](https://img.shields.io/github/tag/campusappcn/chopsticks.svg?label=JitPack)](https://jitpack.io/#campusappcn/chopsticks/0.9)

the missing android layouter.

It is sometimes a pain to layout your views programmatically using Java codes. The Java API cannot be used as the same way as XML. 

__Chopsticks__ is the rescue. Use it to write fluent and XML-like codes to layout your views.

Usage:

```Java
    
    //for inflated views
    Chopsticks.chop(textView)
                .isInRelative()   //parent view is RelativeLayout
                .alignParentTop()
                .alignParentRight()
                .stick();
                
                
    //for new views
    Chopsticks.chop(textView)
                 .isInRelative(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
                 .width(100) //in pixels
                 .stick();
                 

```

You can use static imports to make your codes more elegant.

Currently support RelativeLayout and LinearLayout. More Layouts will be supported.

Add dependencies from jitpack.io

```groovy

   repositories { 
        jcenter()
        maven { url 'https://jitpack.io' }
   }
   
   dependencies {
         compile 'com.github.campusappcn:chopsticks:0.9'
   }
```


<br/>
<br/>
<br/>
<br/>



   Copyright 2015 杭州树洞网络科技有限公司

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.