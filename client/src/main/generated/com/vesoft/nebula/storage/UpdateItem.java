/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.storage;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class UpdateItem implements TBase, java.io.Serializable, Cloneable, Comparable<UpdateItem> {
  private static final TStruct STRUCT_DESC = new TStruct("UpdateItem");
  private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short)1);
  private static final TField PROP_FIELD_DESC = new TField("prop", TType.STRING, (short)2);
  private static final TField VALUE_FIELD_DESC = new TField("value", TType.STRING, (short)3);

  public byte[] name;
  public byte[] prop;
  public byte[] value;
  public static final int NAME = 1;
  public static final int PROP = 2;
  public static final int VALUE = 3;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(NAME, new FieldMetaData("name", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(PROP, new FieldMetaData("prop", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(VALUE, new FieldMetaData("value", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(UpdateItem.class, metaDataMap);
  }

  public UpdateItem() {
  }

  public UpdateItem(
    byte[] name,
    byte[] prop,
    byte[] value)
  {
    this();
    this.name = name;
    this.prop = prop;
    this.value = value;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UpdateItem(UpdateItem other) {
    if (other.isSetName()) {
      this.name = TBaseHelper.deepCopy(other.name);
    }
    if (other.isSetProp()) {
      this.prop = TBaseHelper.deepCopy(other.prop);
    }
    if (other.isSetValue()) {
      this.value = TBaseHelper.deepCopy(other.value);
    }
  }

  public UpdateItem deepCopy() {
    return new UpdateItem(this);
  }

  @Deprecated
  public UpdateItem clone() {
    return new UpdateItem(this);
  }

  public byte[]  getName() {
    return this.name;
  }

  public UpdateItem setName(byte[] name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  // Returns true if field name is set (has been assigned a value) and false otherwise
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public byte[]  getProp() {
    return this.prop;
  }

  public UpdateItem setProp(byte[] prop) {
    this.prop = prop;
    return this;
  }

  public void unsetProp() {
    this.prop = null;
  }

  // Returns true if field prop is set (has been assigned a value) and false otherwise
  public boolean isSetProp() {
    return this.prop != null;
  }

  public void setPropIsSet(boolean value) {
    if (!value) {
      this.prop = null;
    }
  }

  public byte[]  getValue() {
    return this.value;
  }

  public UpdateItem setValue(byte[] value) {
    this.value = value;
    return this;
  }

  public void unsetValue() {
    this.value = null;
  }

  // Returns true if field value is set (has been assigned a value) and false otherwise
  public boolean isSetValue() {
    return this.value != null;
  }

  public void setValueIsSet(boolean value) {
    if (!value) {
      this.value = null;
    }
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((byte[])value);
      }
      break;

    case PROP:
      if (value == null) {
        unsetProp();
      } else {
        setProp((byte[])value);
      }
      break;

    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((byte[])value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case NAME:
      return getName();

    case PROP:
      return getProp();

    case VALUE:
      return getValue();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case NAME:
      return isSetName();
    case PROP:
      return isSetProp();
    case VALUE:
      return isSetValue();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UpdateItem)
      return this.equals((UpdateItem)that);
    return false;
  }

  public boolean equals(UpdateItem that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!TBaseHelper.equalsSlow(this.name, that.name))
        return false;
    }

    boolean this_present_prop = true && this.isSetProp();
    boolean that_present_prop = true && that.isSetProp();
    if (this_present_prop || that_present_prop) {
      if (!(this_present_prop && that_present_prop))
        return false;
      if (!TBaseHelper.equalsSlow(this.prop, that.prop))
        return false;
    }

    boolean this_present_value = true && this.isSetValue();
    boolean that_present_value = true && that.isSetValue();
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (!TBaseHelper.equalsSlow(this.value, that.value))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_name = true && (isSetName());
    builder.append(present_name);
    if (present_name)
      builder.append(name);

    boolean present_prop = true && (isSetProp());
    builder.append(present_prop);
    if (present_prop)
      builder.append(prop);

    boolean present_value = true && (isSetValue());
    builder.append(present_value);
    if (present_value)
      builder.append(value);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(UpdateItem other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(name, other.name);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetProp()).compareTo(other.isSetProp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(prop, other.prop);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetValue()).compareTo(other.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(value, other.value);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case NAME:
          if (field.type == TType.STRING) {
            this.name = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case PROP:
          if (field.type == TType.STRING) {
            this.prop = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case VALUE:
          if (field.type == TType.STRING) {
            this.value = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeBinary(this.name);
      oprot.writeFieldEnd();
    }
    if (this.prop != null) {
      oprot.writeFieldBegin(PROP_FIELD_DESC);
      oprot.writeBinary(this.prop);
      oprot.writeFieldEnd();
    }
    if (this.value != null) {
      oprot.writeFieldBegin(VALUE_FIELD_DESC);
      oprot.writeBinary(this.value);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("UpdateItem");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("name");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getName() == null) {
      sb.append("null");
    } else {
        int __name_size = Math.min(this. getName().length, 128);
        for (int i = 0; i < __name_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this. getName()[i]).length() > 1 ? Integer.toHexString(this. getName()[i]).substring(Integer.toHexString(this. getName()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this. getName()[i]).toUpperCase());
        }
        if (this. getName().length > 128) sb.append(" ...");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("prop");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getProp() == null) {
      sb.append("null");
    } else {
        int __prop_size = Math.min(this. getProp().length, 128);
        for (int i = 0; i < __prop_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this. getProp()[i]).length() > 1 ? Integer.toHexString(this. getProp()[i]).substring(Integer.toHexString(this. getProp()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this. getProp()[i]).toUpperCase());
        }
        if (this. getProp().length > 128) sb.append(" ...");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("value");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getValue() == null) {
      sb.append("null");
    } else {
        int __value_size = Math.min(this. getValue().length, 128);
        for (int i = 0; i < __value_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this. getValue()[i]).length() > 1 ? Integer.toHexString(this. getValue()[i]).substring(Integer.toHexString(this. getValue()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this. getValue()[i]).toUpperCase());
        }
        if (this. getValue().length > 128) sb.append(" ...");
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (name == null) {
      throw new TProtocolException(TProtocolException.MISSING_REQUIRED_FIELD, "Required field 'name' was not present! Struct: " + toString());
    }
    if (prop == null) {
      throw new TProtocolException(TProtocolException.MISSING_REQUIRED_FIELD, "Required field 'prop' was not present! Struct: " + toString());
    }
    if (value == null) {
      throw new TProtocolException(TProtocolException.MISSING_REQUIRED_FIELD, "Required field 'value' was not present! Struct: " + toString());
    }
    // check that fields of type enum have valid values
  }

}

