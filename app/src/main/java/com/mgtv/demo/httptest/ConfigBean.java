package com.mgtv.demo.httptest;

import androidx.annotation.Keep;

import java.util.List;

/**
 * @author lyz
 * 创建日期：2019-10-22  12:33
 * ConfigBean描述：
 */
@Keep
public class ConfigBean {

    /**
     * is_use_ad_cache : 0
     * is_new_feature : 1
     * is_use_ipdx : 1
     * ipdx_url : http://iamtest444.com
     * ipdx_advance_time : 0
     * main_host_timeout : 0
     * backup_host_timeout : 0
     * retry_interval : 0
     * retry_status : 1
     * parbat : 0
     * ima : 0
     * mobile_video : 0
     * gdt : 0
     * host :
     * schema :
     * live_host : adlive.da.mgtv.com
     * live_schema : https
     * load_time : 0
     * ins_info_desc : http://iamtest333.com
     * ins_switch : 1
     * lm_cxid :
     * lm_mid_bl : 0
     * lm_pid_bl : []
     * lm_pkg_wl : []
     * cdn_dest : http://tnet.da.mgtv.com/info.php
     * crash_dest : http://d.da.mgtv.com/d/crash
     * sfks : 0
     * warm_boot : 0
     * warm_boot_interval : 0
     * warm_boot_timeout : 0
     * warm_boot_animat : http://iamtest111.com
     * warm_boot_valid_time : 0
     * refocus_imp : http://iamtest222.com
     * oppo : 0
     * adhub : 0
     */
    private int paster_preload;
    private int is_use_ad_cache;
    private int is_new_feature;
    private int is_use_ipdx;
    public String ipdx_url;
    public int ipdx_advance_time;
    public List<String> ipdx_err_url;
    /**
     * 域名重试主域名timeout
     */
    private int main_host_timeout;
    /***
     * 域名重试重试域名timeout
     */
    private int backup_host_timeout;
    private int retry_interval;
    /**
     * 是否支持重试 默认开启
     */
    private int retry_status;
    /**
     * 帕尔加特开关控制
     */
    private int parbat;
    /**
     * google IMA控制
     */
    private int ima;
    private int mobile_video;
    /**
     * 广点通开关控制
     */
    private int gdt;
    /***
     * 主域名
     */
    private String host;
    /***
     * 主域名schema
     */
    private String schema;
    /**
     * 直播主域名
     */
    private String live_host;
    /**
     * 直播scheme
     */
    private String live_schema;
    /***
     * 开机超时时间
     */
    private int load_time;
    /**
     * 扫描已安装APP上报地址
     */
    private String ins_info_desc;
    /**
     * 控制扫描app开启或者关闭 1:开启 0:关闭
     */
    private int ins_switch;
    private String lm_cxid;
    private int lm_mid_bl;
    private String cdn_dest;
    private String crash_dest;
    /***
     * 中插开关
     */
    private int middle_ad;
    /***
     * 原创开关
     */
    private int original_ad;
    /**
     * 赛克菲斯开关
     */
    private int sfks;
    /**
     * 热启动开关
     */
    private int warm_boot;
    /**
     * 热启动间隔时间
     */
    private int warm_boot_interval;
    /**
     * 热启动全局超时时间
     */
    private int warm_boot_timeout;
    /**
     * 热启动过渡动画
     */
    private String warm_boot_animat;
    /**
     * 热启动有效时间-单位:秒
     */
    private int warm_boot_valid_time;
    /**
     * 后台切回前台上报
     */
    private String refocus_imp;
    /**
     * oppo 开关
     */
    private int oppo;
    /**
     * adhub 开关
     */
    private int adhub;

    private List<String> backups;

    private List<String> backup_schemas;

    private int hnet;//欢网sdk开关

    private List<?> lm_pid_bl;
    private List<?> lm_pkg_wl;

    public int getHnet() {
        return hnet;
    }

    public void setHnet(int hnet) {
        this.hnet = hnet;
    }

    public List<String> getBackups() {
        return backups;
    }

    public void setBackups(List<String> backups) {
        this.backups = backups;
    }

    public List<String> getBackup_schemas() {
        return backup_schemas;
    }

    public void setBackup_schemas(List<String> backup_schemas) {
        this.backup_schemas = backup_schemas;
    }

    public int getIs_use_ad_cache() {
        return is_use_ad_cache;
    }

    public void setIs_use_ad_cache(int is_use_ad_cache) {
        this.is_use_ad_cache = is_use_ad_cache;
    }

    public int getIs_new_feature() {
        return is_new_feature;
    }

    public void setIs_new_feature(int is_new_feature) {
        this.is_new_feature = is_new_feature;
    }

    public int getIs_use_ipdx() {
        return is_use_ipdx;
    }

    public void setIs_use_ipdx(int is_use_ipdx) {
        this.is_use_ipdx = is_use_ipdx;
    }

    public String getIpdx_url() {
        return ipdx_url;
    }

    public void setIpdx_url(String ipdx_url) {
        this.ipdx_url = ipdx_url;
    }

    public int getIpdx_advance_time() {
        return ipdx_advance_time;
    }

    public void setIpdx_advance_time(int ipdx_advance_time) {
        this.ipdx_advance_time = ipdx_advance_time;
    }

    public int getMain_host_timeout() {
        return main_host_timeout;
    }

    public void setMain_host_timeout(int main_host_timeout) {
        this.main_host_timeout = main_host_timeout;
    }

    public int getBackup_host_timeout() {
        return backup_host_timeout;
    }

    public void setBackup_host_timeout(int backup_host_timeout) {
        this.backup_host_timeout = backup_host_timeout;
    }

    public int getRetry_interval() {
        return retry_interval;
    }

    public void setRetry_interval(int retry_interval) {
        this.retry_interval = retry_interval;
    }

    public int getRetry_status() {
        return retry_status;
    }

    public void setRetry_status(int retry_status) {
        this.retry_status = retry_status;
    }

    public int getParbat() {
        return parbat;
    }

    public void setParbat(int parbat) {
        this.parbat = parbat;
    }

    public int getIma() {
        return ima;
    }

    public void setIma(int ima) {
        this.ima = ima;
    }

    public int getMobile_video() {
        return mobile_video;
    }

    public void setMobile_video(int mobile_video) {
        this.mobile_video = mobile_video;
    }

    public int getGdt() {
        return gdt;
    }

    public void setGdt(int gdt) {
        this.gdt = gdt;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getLive_host() {
        return live_host;
    }

    public void setLive_host(String live_host) {
        this.live_host = live_host;
    }

    public String getLive_schema() {
        return live_schema;
    }

    public void setLive_schema(String live_schema) {
        this.live_schema = live_schema;
    }

    public int getLoad_time() {
        return load_time;
    }

    public void setLoad_time(int load_time) {
        this.load_time = load_time;
    }

    public String getIns_info_desc() {
        return ins_info_desc;
    }

    public void setIns_info_desc(String ins_info_desc) {
        this.ins_info_desc = ins_info_desc;
    }

    public int getIns_switch() {
        return ins_switch;
    }

    public void setIns_switch(int ins_switch) {
        this.ins_switch = ins_switch;
    }

    public String getLm_cxid() {
        return lm_cxid;
    }

    public void setLm_cxid(String lm_cxid) {
        this.lm_cxid = lm_cxid;
    }

    public int getLm_mid_bl() {
        return lm_mid_bl;
    }

    public void setLm_mid_bl(int lm_mid_bl) {
        this.lm_mid_bl = lm_mid_bl;
    }

    public String getCdn_dest() {
        return cdn_dest;
    }

    public void setCdn_dest(String cdn_dest) {
        this.cdn_dest = cdn_dest;
    }

    public String getCrash_dest() {
        return crash_dest;
    }

    public void setCrash_dest(String crash_dest) {
        this.crash_dest = crash_dest;
    }

    public int getSfks() {
        return sfks;
    }

    public void setSfks(int sfks) {
        this.sfks = sfks;
    }

    public int getWarm_boot() {
        return warm_boot;
    }

    public void setWarm_boot(int warm_boot) {
        this.warm_boot = warm_boot;
    }

    public int getWarm_boot_interval() {
        return warm_boot_interval;
    }

    public void setWarm_boot_interval(int warm_boot_interval) {
        this.warm_boot_interval = warm_boot_interval;
    }

    public int getWarm_boot_timeout() {
        return warm_boot_timeout;
    }

    public void setWarm_boot_timeout(int warm_boot_timeout) {
        this.warm_boot_timeout = warm_boot_timeout;
    }

    public String getWarm_boot_animat() {
        return warm_boot_animat;
    }

    public void setWarm_boot_animat(String warm_boot_animat) {
        this.warm_boot_animat = warm_boot_animat;
    }

    public int getWarm_boot_valid_time() {
        return warm_boot_valid_time;
    }

    public void setWarm_boot_valid_time(int warm_boot_valid_time) {
        this.warm_boot_valid_time = warm_boot_valid_time;
    }

    public String getRefocus_imp() {
        return refocus_imp;
    }

    public void setRefocus_imp(String refocus_imp) {
        this.refocus_imp = refocus_imp;
    }

    public int getOppo() {
        return oppo;
    }

    public void setOppo(int oppo) {
        this.oppo = oppo;
    }

    public int getAdhub() {
        return adhub;
    }

    public void setAdhub(int adhub) {
        this.adhub = adhub;
    }

    public List<?> getLm_pid_bl() {
        return lm_pid_bl;
    }

    public void setLm_pid_bl(List<?> lm_pid_bl) {
        this.lm_pid_bl = lm_pid_bl;
    }

    public List<?> getLm_pkg_wl() {
        return lm_pkg_wl;
    }

    public void setLm_pkg_wl(List<?> lm_pkg_wl) {
        this.lm_pkg_wl = lm_pkg_wl;
    }

    public int getMiddle_ad() {
        return middle_ad;
    }

    public void setMiddle_ad(int middle_ad) {
        this.middle_ad = middle_ad;
    }

    public int getOriginal_ad() {
        return original_ad;
    }

    public void setOriginal_ad(int original_ad) {
        this.original_ad = original_ad;
    }

    public int getPaster_preload() {
        return paster_preload;
    }

    public void setPaster_preload(int paster_preload) {
        this.paster_preload = paster_preload;
    }

    @Override
    public String toString() {
        return "ConfigBean{" +
                "is_use_ad_cache=" + is_use_ad_cache +
                ", is_new_feature=" + is_new_feature +
                ", is_use_ipdx=" + is_use_ipdx +
                ", ipdx_url='" + ipdx_url + '\'' +
                ", ipdx_advance_time=" + ipdx_advance_time +
                ", main_host_timeout=" + main_host_timeout +
                ", backup_host_timeout=" + backup_host_timeout +
                ", retry_interval=" + retry_interval +
                ", retry_status=" + retry_status +
                ", parbat=" + parbat +
                ", ima=" + ima +
                ", mobile_video=" + mobile_video +
                ", gdt=" + gdt +
                ", host='" + host + '\'' +
                ", schema='" + schema + '\'' +
                ", live_host='" + live_host + '\'' +
                ", live_schema='" + live_schema + '\'' +
                ", load_time=" + load_time +
                ", ins_info_desc='" + ins_info_desc + '\'' +
                ", ins_switch=" + ins_switch +
                ", lm_cxid='" + lm_cxid + '\'' +
                ", lm_mid_bl=" + lm_mid_bl +
                ", cdn_dest='" + cdn_dest + '\'' +
                ", crash_dest='" + crash_dest + '\'' +
                ", middle_ad=" + middle_ad +
                ", original_ad=" + original_ad +
                ", sfks=" + sfks +
                ", warm_boot=" + warm_boot +
                ", warm_boot_interval=" + warm_boot_interval +
                ", warm_boot_timeout=" + warm_boot_timeout +
                ", warm_boot_animat='" + warm_boot_animat + '\'' +
                ", warm_boot_valid_time=" + warm_boot_valid_time +
                ", refocus_imp='" + refocus_imp + '\'' +
                ", oppo=" + oppo +
                ", adhub=" + adhub +
                ", backups=" + backups +
                ", backup_schemas=" + backup_schemas +
                ", lm_pid_bl=" + lm_pid_bl +
                ", lm_pkg_wl=" + lm_pkg_wl +
                '}';
    }
}
