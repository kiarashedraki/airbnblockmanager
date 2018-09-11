
package me.edraki.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reservations")
public class Reservation {

    @JsonProperty("user_id")
    public Integer userId;
    @JsonProperty("code")
    public String code;
    @JsonProperty("start_date")
    public String startDate;
    @JsonProperty("end_date")
    public String endDate;
    @JsonProperty("nights")
    public Integer nights;
    @JsonProperty("guests")
    public Integer guests;
    @JsonProperty("status")
    public String status;
    @JsonProperty("listing")
    public Listing listing;
    @JsonProperty("guest")
    public Guest guest;
    @JsonProperty("currency")
    public String currency;
    @JsonProperty("security_price")
    public Integer securityPrice;
    @JsonProperty("security_price_formatted")
    public String securityPriceFormatted;
    @JsonProperty("base_price")
    public Integer basePrice;
    @JsonProperty("base_price_formatted")
    public String basePriceFormatted;
    @JsonProperty("guest_fee")
    public Integer guestFee;
    @JsonProperty("guest_fee_formatted")
    public String guestFeeFormatted;
    @JsonProperty("tax_amount")
    public Integer taxAmount;
    @JsonProperty("tax_amount_formatted")
    public String taxAmountFormatted;
    @JsonProperty("extras_price")
    public Integer extrasPrice;
    @JsonProperty("extras_price_formatted")
    public String extrasPriceFormatted;
    @JsonProperty("subtotal")
    public Integer subtotal;
    @JsonProperty("subtotal_formatted")
    public String subtotalFormatted;
    @JsonProperty("total_price")
    public Integer totalPrice;
    @JsonProperty("total_price_formatted")
    public String totalPriceFormatted;
    @JsonProperty("per_night_price")
    public Integer perNightPrice;
    @JsonProperty("per_night_price_formatted")
    public String perNightPriceFormatted;
    @JsonProperty("payout_price")
    public Integer payoutPrice;
    @JsonProperty("created_at")
    public Integer createdAt;
    @JsonProperty("updated_at")
    public Integer updatedAt;
    @JsonProperty("sent_at")
    public Integer sentAt;
}
