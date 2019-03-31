package org.docksidestage.dbflute.flex.bs {

// *customization mark by jflute
import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.*;

/**
 * The flex DTO of WHITE_TSV_LOADING as TABLE.
 * <pre>
 * [primary-key]
 *     TSV_LOADING_ID
 *
 * [column]
 *     TSV_LOADING_ID, TSV_LOADING_NAME, LOADING_COUNT, LOADING_DATE, BEGIN_DATETIME, END_DATETIME, LARGE_FROM_FILE, DONE_FLG
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteTsvLoading {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _tsvLoadingId:Number;

    private var _tsvLoadingName:String;

    private var _loadingCount:int;

    private var _loadingDate:Date;

    private var _beginDatetime:Date;

    private var _endDatetime:Date;

    private var _largeFromFile:String;

    private var _doneFlg:Boolean;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get tsvLoadingId():Number {
        return _tsvLoadingId;
    }

    public function set tsvLoadingId(tsvLoadingId:Number):void {
        this._tsvLoadingId = tsvLoadingId;
    }

    public function get tsvLoadingName():String {
        return _tsvLoadingName;
    }

    public function set tsvLoadingName(tsvLoadingName:String):void {
        this._tsvLoadingName = tsvLoadingName;
    }

    public function get loadingCount():int {
        return _loadingCount;
    }

    public function set loadingCount(loadingCount:int):void {
        this._loadingCount = loadingCount;
    }

    public function get loadingDate():Date {
        return _loadingDate;
    }

    public function set loadingDate(loadingDate:Date):void {
        this._loadingDate = loadingDate;
    }

    public function get beginDatetime():Date {
        return _beginDatetime;
    }

    public function set beginDatetime(beginDatetime:Date):void {
        this._beginDatetime = beginDatetime;
    }

    public function get endDatetime():Date {
        return _endDatetime;
    }

    public function set endDatetime(endDatetime:Date):void {
        this._endDatetime = endDatetime;
    }

    public function get largeFromFile():String {
        return _largeFromFile;
    }

    public function set largeFromFile(largeFromFile:String):void {
        this._largeFromFile = largeFromFile;
    }

    public function get doneFlg():Boolean {
        return _doneFlg;
    }

    public function set doneFlg(doneFlg:Boolean):void {
        this._doneFlg = doneFlg;
    }

}

}
