
//通过各个子module中的makeJar生成不同依赖的网络和图片jar包，根据具体需求打包不同jar包进aar

//image 模块实现无缝替换库
- **打造统一的图片加载框架，融合Glide，Fresco，一套API兼容两种加载方式**
https://github.com/ladingwu/ImageLoaderFramework

//基础库
https://github.com/AbrahamCaiJin/CommonUtilLibrary

举个例子
XImageLoader.getInstance().showImage(XImageLoader.getDefaultOptions(imageView, imageUrl, new LoaderResultCallBack() {
            @Override
            public void onSuccess() {
                XLog.d("image-onSuccess");
            }

            @Override
            public void onFailed(String errorMsg) {
                XLog.d("image-onFailed"+errorMsg);
            }
        }));


        BaseHttpParameter baseHttpParameter=new BaseHttpParameter();
        baseHttpParameter.put("p", "{\"c\":{\"brand\":\"OPPO\",\"did\":\"ZgOOgo5MjkyOTHsOOyC0BnsODUsOBXsgewUGdnt2fDt8DrSqfHwGBoe/hw0NqpUFS3yqjkyOTI5MZgOOgg==\",\"mac\":\"48:95:07:67:6C:07\",\"mf\":\"OPPO\",\"mn\":\"PCAM00\",\"mod\":\"PCAM00\",\"os\":\"11\",\"osVerCode\":30,\"ts\":1674895503445,\"type\":100,\"version\":\"\"},\"ex\":{},\"float_ex\":4,\"ipdx\":{\"exptime\":0,\"geocode\":\"\",\"id\":\"\",\"ip\":\"\"},\"m\":{\"aid\":0,\"allowad\":110110,\"id\":0,\"p\":4820,\"ptype\":\"\",\"trigger_time\":0},\"parameter\":526512,\"realtime\":1,\"sdkversion\":\"IMGADSDK_2.3.7\",\"u\":{\"time\":0,\"vip\":0}}");
        baseHttpParameter.put("v", "");
        baseHttpParameter.put("id", UUID.randomUUID().toString());
        XHttp.obtain().post(httpUrl, null, new HttpCallBack<ConfigBean>() {
            @Override
            public void onSuccess(ConfigBean o) {
                XLog.d(o);
            }

            @Override
            public void onFailed(String error) {
                XLog.d(error);
            }
        });




