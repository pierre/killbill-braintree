/*
 * Copyright 2021 Wovenware, Inc
 *
 * Wovenware licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.killbill.billing.plugin.braintree.dao.gen.tables.records;


import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;
import org.killbill.billing.plugin.braintree.dao.gen.tables.BraintreePaymentMethods;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BraintreePaymentMethodsRecord extends UpdatableRecordImpl<BraintreePaymentMethodsRecord> implements Record10<ULong, String, String, String, Short, Short, String, LocalDateTime, LocalDateTime, String> {

    private static final long serialVersionUID = -2040246654;

    /**
     * Setter for <code>killbill.braintree_payment_methods.record_id</code>.
     */
    public void setRecordId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>killbill.braintree_payment_methods.record_id</code>.
     */
    public ULong getRecordId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>killbill.braintree_payment_methods.kb_account_id</code>.
     */
    public void setKbAccountId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>killbill.braintree_payment_methods.kb_account_id</code>.
     */
    public String getKbAccountId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>killbill.braintree_payment_methods.kb_payment_method_id</code>.
     */
    public void setKbPaymentMethodId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>killbill.braintree_payment_methods.kb_payment_method_id</code>.
     */
    public String getKbPaymentMethodId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>killbill.braintree_payment_methods.braintree_id</code>.
     */
    public void setBraintreeId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>killbill.braintree_payment_methods.braintree_id</code>.
     */
    public String getBraintreeId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>killbill.braintree_payment_methods.is_default</code>.
     */
    public void setIsDefault(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>killbill.braintree_payment_methods.is_default</code>.
     */
    public Short getIsDefault() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>killbill.braintree_payment_methods.is_deleted</code>.
     */
    public void setIsDeleted(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>killbill.braintree_payment_methods.is_deleted</code>.
     */
    public Short getIsDeleted() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>killbill.braintree_payment_methods.additional_data</code>.
     */
    public void setAdditionalData(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>killbill.braintree_payment_methods.additional_data</code>.
     */
    public String getAdditionalData() {
        return (String) get(6);
    }

    /**
     * Setter for <code>killbill.braintree_payment_methods.created_date</code>.
     */
    public void setCreatedDate(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>killbill.braintree_payment_methods.created_date</code>.
     */
    public LocalDateTime getCreatedDate() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>killbill.braintree_payment_methods.updated_date</code>.
     */
    public void setUpdatedDate(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>killbill.braintree_payment_methods.updated_date</code>.
     */
    public LocalDateTime getUpdatedDate() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>killbill.braintree_payment_methods.kb_tenant_id</code>.
     */
    public void setKbTenantId(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>killbill.braintree_payment_methods.kb_tenant_id</code>.
     */
    public String getKbTenantId() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<ULong, String, String, String, Short, Short, String, LocalDateTime, LocalDateTime, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<ULong, String, String, String, Short, Short, String, LocalDateTime, LocalDateTime, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return BraintreePaymentMethods.BRAINTREE_PAYMENT_METHODS.RECORD_ID;
    }

    @Override
    public Field<String> field2() {
        return BraintreePaymentMethods.BRAINTREE_PAYMENT_METHODS.KB_ACCOUNT_ID;
    }

    @Override
    public Field<String> field3() {
        return BraintreePaymentMethods.BRAINTREE_PAYMENT_METHODS.KB_PAYMENT_METHOD_ID;
    }

    @Override
    public Field<String> field4() {
        return BraintreePaymentMethods.BRAINTREE_PAYMENT_METHODS.BRAINTREE_ID;
    }

    @Override
    public Field<Short> field5() {
        return BraintreePaymentMethods.BRAINTREE_PAYMENT_METHODS.IS_DEFAULT;
    }

    @Override
    public Field<Short> field6() {
        return BraintreePaymentMethods.BRAINTREE_PAYMENT_METHODS.IS_DELETED;
    }

    @Override
    public Field<String> field7() {
        return BraintreePaymentMethods.BRAINTREE_PAYMENT_METHODS.ADDITIONAL_DATA;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return BraintreePaymentMethods.BRAINTREE_PAYMENT_METHODS.CREATED_DATE;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return BraintreePaymentMethods.BRAINTREE_PAYMENT_METHODS.UPDATED_DATE;
    }

    @Override
    public Field<String> field10() {
        return BraintreePaymentMethods.BRAINTREE_PAYMENT_METHODS.KB_TENANT_ID;
    }

    @Override
    public ULong component1() {
        return getRecordId();
    }

    @Override
    public String component2() {
        return getKbAccountId();
    }

    @Override
    public String component3() {
        return getKbPaymentMethodId();
    }

    @Override
    public String component4() {
        return getBraintreeId();
    }

    @Override
    public Short component5() {
        return getIsDefault();
    }

    @Override
    public Short component6() {
        return getIsDeleted();
    }

    @Override
    public String component7() {
        return getAdditionalData();
    }

    @Override
    public LocalDateTime component8() {
        return getCreatedDate();
    }

    @Override
    public LocalDateTime component9() {
        return getUpdatedDate();
    }

    @Override
    public String component10() {
        return getKbTenantId();
    }

    @Override
    public ULong value1() {
        return getRecordId();
    }

    @Override
    public String value2() {
        return getKbAccountId();
    }

    @Override
    public String value3() {
        return getKbPaymentMethodId();
    }

    @Override
    public String value4() {
        return getBraintreeId();
    }

    @Override
    public Short value5() {
        return getIsDefault();
    }

    @Override
    public Short value6() {
        return getIsDeleted();
    }

    @Override
    public String value7() {
        return getAdditionalData();
    }

    @Override
    public LocalDateTime value8() {
        return getCreatedDate();
    }

    @Override
    public LocalDateTime value9() {
        return getUpdatedDate();
    }

    @Override
    public String value10() {
        return getKbTenantId();
    }

    @Override
    public BraintreePaymentMethodsRecord value1(ULong value) {
        setRecordId(value);
        return this;
    }

    @Override
    public BraintreePaymentMethodsRecord value2(String value) {
        setKbAccountId(value);
        return this;
    }

    @Override
    public BraintreePaymentMethodsRecord value3(String value) {
        setKbPaymentMethodId(value);
        return this;
    }

    @Override
    public BraintreePaymentMethodsRecord value4(String value) {
        setBraintreeId(value);
        return this;
    }

    @Override
    public BraintreePaymentMethodsRecord value5(Short value) {
        setIsDefault(value);
        return this;
    }

    @Override
    public BraintreePaymentMethodsRecord value6(Short value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public BraintreePaymentMethodsRecord value7(String value) {
        setAdditionalData(value);
        return this;
    }

    @Override
    public BraintreePaymentMethodsRecord value8(LocalDateTime value) {
        setCreatedDate(value);
        return this;
    }

    @Override
    public BraintreePaymentMethodsRecord value9(LocalDateTime value) {
        setUpdatedDate(value);
        return this;
    }

    @Override
    public BraintreePaymentMethodsRecord value10(String value) {
        setKbTenantId(value);
        return this;
    }

    @Override
    public BraintreePaymentMethodsRecord values(ULong value1, String value2, String value3, String value4, Short value5, Short value6, String value7, LocalDateTime value8, LocalDateTime value9, String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BraintreePaymentMethodsRecord
     */
    public BraintreePaymentMethodsRecord() {
        super(BraintreePaymentMethods.BRAINTREE_PAYMENT_METHODS);
    }

    /**
     * Create a detached, initialised BraintreePaymentMethodsRecord
     */
    public BraintreePaymentMethodsRecord(ULong recordId, String kbAccountId, String kbPaymentMethodId, String braintreeId, Short isDefault, Short isDeleted, String additionalData, LocalDateTime createdDate, LocalDateTime updatedDate, String kbTenantId) {
        super(BraintreePaymentMethods.BRAINTREE_PAYMENT_METHODS);

        set(0, recordId);
        set(1, kbAccountId);
        set(2, kbPaymentMethodId);
        set(3, braintreeId);
        set(4, isDefault);
        set(5, isDeleted);
        set(6, additionalData);
        set(7, createdDate);
        set(8, updatedDate);
        set(9, kbTenantId);
    }
}