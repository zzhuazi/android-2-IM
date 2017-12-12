package com.ljh.im;

import android.app.Application;

import com.hyphenate.chat.EMClient;
import com.hyphenate.chat.EMOptions;
import com.hyphenate.util.EasyUtils;
import com.ljh.im.model.Model;

/**
 * Created by Administrator on 2017/12/11.
 */

public class IMApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化EasyUi
        EMOptions options = new EMOptions();
        // 默认添加好友时，是不需要验证的，改成需要验证
        options.setAcceptInvitationAlways(false);
        //设置需要同意后才能接受邀请
        options.setAutoAcceptGroupInvitation(false);
        EMClient.getInstance().init(this, options);

        //初始化数据模型层类
        Model.getInstance().init(this);
    }
}
