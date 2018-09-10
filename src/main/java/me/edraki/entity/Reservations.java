
package me.edraki.entity;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "user_id",
    "code",
    "start_date",
    "end_date",
    "checkin_time",
    "checkout_time",
    "nights",
    "guests",
    "status",
    "listing",
    "guest",
    "currency",
    "security_price",
    "security_price_formatted",
    "per_night_price",
    "per_night_price_formatted",
    "base_price",
    "base_price_formatted",
    "extras_price",
    "extras_price_formatted",
    "subtotal",
    "subtotal_formatted",
    "tax_amount",
    "tax_amount_formatted",
    "guest_fee",
    "guest_fee_formatted",
    "total_price",
    "total_price_formatted",
    "host_service_fee",
    "host_service_fee_formatted",
    "payout_price",
    "payout_price_formatted",
    "created_at",
    "updated_at",
    "sent_at"
})
@Document(collection = "reservations")
public class Reservations {

    @Id
    @JsonProperty("_id")
    private Integer id;
    @JsonProperty("user_id")
    private Integer userId;
    @JsonProperty("code")
    private String code;
    @JsonProperty("start_date")
    private String startDate;
    @JsonProperty("end_date")
    private String endDate;
    @JsonProperty("checkin_time")
    private String checkinTime;
    @JsonProperty("checkout_time")
    private String checkoutTime;
    @JsonProperty("nights")
    private Integer nights;
    @JsonProperty("guests")
    private Integer guests;
    @JsonProperty("status")
    private String status;
    @JsonProperty("listing")
    private Listing listing;
    @JsonProperty("guest")
    private Guest guest;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("security_price")
    private Integer securityPrice;
    @JsonProperty("security_price_formatted")
    private String securityPriceFormatted;
    @JsonProperty("per_night_price")
    private Integer perNightPrice;
    @JsonProperty("per_night_price_formatted")
    private String perNightPriceFormatted;
    @JsonProperty("base_price")
    private Double basePrice;
    @JsonProperty("base_price_formatted")
    private String basePriceFormatted;
    @JsonProperty("extras_price")
    private Integer extrasPrice;
    @JsonProperty("extras_price_formatted")
    private String extrasPriceFormatted;
    @JsonProperty("subtotal")
    private Double subtotal;
    @JsonProperty("subtotal_formatted")
    private String subtotalFormatted;
    @JsonProperty("tax_amount")
    private Integer taxAmount;
    @JsonProperty("tax_amount_formatted")
    private String taxAmountFormatted;
    @JsonProperty("guest_fee")
    private Integer guestFee;
    @JsonProperty("guest_fee_formatted")
    private String guestFeeFormatted;
    @JsonProperty("total_price")
    private Integer totalPrice;
    @JsonProperty("total_price_formatted")
    private String totalPriceFormatted;
    @JsonProperty("host_service_fee")
    private Double hostServiceFee;
    @JsonProperty("host_service_fee_formatted")
    private String hostServiceFeeFormatted;
    @JsonProperty("payout_price")
    private Double payoutPrice;
    @JsonProperty("payout_price_formatted")
    private String payoutPriceFormatted;
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("updated_at")
    private Integer updatedAt;
    @JsonProperty("sent_at")
    private Integer sentAt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("user_id")
    public Integer getUserId() {
        return userId;
    }

    @JsonProperty("user_id")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("start_date")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("start_date")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("end_date")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("end_date")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("checkin_time")
    public String getCheckinTime() {
        return checkinTime;
    }

    @JsonProperty("checkin_time")
    public void setCheckinTime(String checkinTime) {
        this.checkinTime = checkinTime;
    }

    @JsonProperty("checkout_time")
    public String getCheckoutTime() {
        return checkoutTime;
    }

    @JsonProperty("checkout_time")
    public void setCheckoutTime(String checkoutTime) {
        this.checkoutTime = checkoutTime;
    }

    @JsonProperty("nights")
    public Integer getNights() {
        return nights;
    }

    @JsonProperty("nights")
    public void setNights(Integer nights) {
        this.nights = nights;
    }

    @JsonProperty("guests")
    public Integer getGuests() {
        return guests;
    }

    @JsonProperty("guests")
    public void setGuests(Integer guests) {
        this.guests = guests;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("listing")
    public Listing getListing() {
        return listing;
    }

    @JsonProperty("listing")
    public void setListing(Listing listing) {
        this.listing = listing;
    }

    @JsonProperty("guest")
    public Guest getGuest() {
        return guest;
    }

    @JsonProperty("guest")
    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("security_price")
    public Integer getSecurityPrice() {
        return securityPrice;
    }

    @JsonProperty("security_price")
    public void setSecurityPrice(Integer securityPrice) {
        this.securityPrice = securityPrice;
    }

    @JsonProperty("security_price_formatted")
    public String getSecurityPriceFormatted() {
        return securityPriceFormatted;
    }

    @JsonProperty("security_price_formatted")
    public void setSecurityPriceFormatted(String securityPriceFormatted) {
        this.securityPriceFormatted = securityPriceFormatted;
    }

    @JsonProperty("per_night_price")
    public Integer getPerNightPrice() {
        return perNightPrice;
    }

    @JsonProperty("per_night_price")
    public void setPerNightPrice(Integer perNightPrice) {
        this.perNightPrice = perNightPrice;
    }

    @JsonProperty("per_night_price_formatted")
    public String getPerNightPriceFormatted() {
        return perNightPriceFormatted;
    }

    @JsonProperty("per_night_price_formatted")
    public void setPerNightPriceFormatted(String perNightPriceFormatted) {
        this.perNightPriceFormatted = perNightPriceFormatted;
    }

    @JsonProperty("base_price")
    public Double getBasePrice() {
        return basePrice;
    }

    @JsonProperty("base_price")
    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    @JsonProperty("base_price_formatted")
    public String getBasePriceFormatted() {
        return basePriceFormatted;
    }

    @JsonProperty("base_price_formatted")
    public void setBasePriceFormatted(String basePriceFormatted) {
        this.basePriceFormatted = basePriceFormatted;
    }

    @JsonProperty("extras_price")
    public Integer getExtrasPrice() {
        return extrasPrice;
    }

    @JsonProperty("extras_price")
    public void setExtrasPrice(Integer extrasPrice) {
        this.extrasPrice = extrasPrice;
    }

    @JsonProperty("extras_price_formatted")
    public String getExtrasPriceFormatted() {
        return extrasPriceFormatted;
    }

    @JsonProperty("extras_price_formatted")
    public void setExtrasPriceFormatted(String extrasPriceFormatted) {
        this.extrasPriceFormatted = extrasPriceFormatted;
    }

    @JsonProperty("subtotal")
    public Double getSubtotal() {
        return subtotal;
    }

    @JsonProperty("subtotal")
    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    @JsonProperty("subtotal_formatted")
    public String getSubtotalFormatted() {
        return subtotalFormatted;
    }

    @JsonProperty("subtotal_formatted")
    public void setSubtotalFormatted(String subtotalFormatted) {
        this.subtotalFormatted = subtotalFormatted;
    }

    @JsonProperty("tax_amount")
    public Integer getTaxAmount() {
        return taxAmount;
    }

    @JsonProperty("tax_amount")
    public void setTaxAmount(Integer taxAmount) {
        this.taxAmount = taxAmount;
    }

    @JsonProperty("tax_amount_formatted")
    public String getTaxAmountFormatted() {
        return taxAmountFormatted;
    }

    @JsonProperty("tax_amount_formatted")
    public void setTaxAmountFormatted(String taxAmountFormatted) {
        this.taxAmountFormatted = taxAmountFormatted;
    }

    @JsonProperty("guest_fee")
    public Integer getGuestFee() {
        return guestFee;
    }

    @JsonProperty("guest_fee")
    public void setGuestFee(Integer guestFee) {
        this.guestFee = guestFee;
    }

    @JsonProperty("guest_fee_formatted")
    public String getGuestFeeFormatted() {
        return guestFeeFormatted;
    }

    @JsonProperty("guest_fee_formatted")
    public void setGuestFeeFormatted(String guestFeeFormatted) {
        this.guestFeeFormatted = guestFeeFormatted;
    }

    @JsonProperty("total_price")
    public Integer getTotalPrice() {
        return totalPrice;
    }

    @JsonProperty("total_price")
    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    @JsonProperty("total_price_formatted")
    public String getTotalPriceFormatted() {
        return totalPriceFormatted;
    }

    @JsonProperty("total_price_formatted")
    public void setTotalPriceFormatted(String totalPriceFormatted) {
        this.totalPriceFormatted = totalPriceFormatted;
    }

    @JsonProperty("host_service_fee")
    public Double getHostServiceFee() {
        return hostServiceFee;
    }

    @JsonProperty("host_service_fee")
    public void setHostServiceFee(Double hostServiceFee) {
        this.hostServiceFee = hostServiceFee;
    }

    @JsonProperty("host_service_fee_formatted")
    public String getHostServiceFeeFormatted() {
        return hostServiceFeeFormatted;
    }

    @JsonProperty("host_service_fee_formatted")
    public void setHostServiceFeeFormatted(String hostServiceFeeFormatted) {
        this.hostServiceFeeFormatted = hostServiceFeeFormatted;
    }

    @JsonProperty("payout_price")
    public Double getPayoutPrice() {
        return payoutPrice;
    }

    @JsonProperty("payout_price")
    public void setPayoutPrice(Double payoutPrice) {
        this.payoutPrice = payoutPrice;
    }

    @JsonProperty("payout_price_formatted")
    public String getPayoutPriceFormatted() {
        return payoutPriceFormatted;
    }

    @JsonProperty("payout_price_formatted")
    public void setPayoutPriceFormatted(String payoutPriceFormatted) {
        this.payoutPriceFormatted = payoutPriceFormatted;
    }

    @JsonProperty("created_at")
    public Integer getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public Integer getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("sent_at")
    public Integer getSentAt() {
        return sentAt;
    }

    @JsonProperty("sent_at")
    public void setSentAt(Integer sentAt) {
        this.sentAt = sentAt;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
