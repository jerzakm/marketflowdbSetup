package app.config;

public final class DbStructure {
    public static final String[] pointInTimeMoney = {

    };

    public static final String[] pointInTimeInt = {
            "adminKilled"
    };

    public static final String[] pointInTimeBigInt = {
            "updates", //whenever data about offer comes in
            "itHitCount"
    };

    public static final String[] pointInTimeString = {

    };

    public static final String[] rangeInTimeMoney = {
            "itBuyNowPrice",
            "itPrice" //current price - auction
    };

    public static final String[] rangeInTimeInt = {
            "itState",
            "itIsEco",
            "itIsForGuests",
            "itHasProduct",
            "itOrderFulfillmentTime",
            "itIsAllegroStandard",
            "itIsBrandZone",
            "itemCategory", //LOWEST LEVEL instead of entire tree
            "itBidCount", //bids #
            "itQuantity", //stock #
            "itBuyNowActive",
            "itFotoCount"
    };

    public static final String[] rangeInTimeBigInt = {

    };

    public static final String[] rangeInTimeString = {
            "itName", //offer Name
            "itLocation"
    };

    public static final String[] kv = {
            "offer-itSellerId", "itSellerId-sellerName", "itStartingQuantity", "itEndingInfo","itEndingTime"
    };

    public static final String[] special = {"postage","itOptions","itemAttribs", "itStandardizedDescription"};

}
