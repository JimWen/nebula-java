/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.meta;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.annotations.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class PartitionList implements TBase, java.io.Serializable, Cloneable, Comparable<PartitionList> {
  private static final TStruct STRUCT_DESC = new TStruct("PartitionList");
  private static final TField PART_LIST_FIELD_DESC = new TField("part_list", TType.LIST, (short)1);

  public List<Integer> part_list;
  public static final int PART_LIST = 1;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(PART_LIST, new FieldMetaData("part_list", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.I32))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(PartitionList.class, metaDataMap);
  }

  public PartitionList() {
  }

  public PartitionList(
      List<Integer> part_list) {
    this();
    this.part_list = part_list;
  }

  public static class Builder {
    private List<Integer> part_list;

    public Builder() {
    }

    public Builder setPart_list(final List<Integer> part_list) {
      this.part_list = part_list;
      return this;
    }

    public PartitionList build() {
      PartitionList result = new PartitionList();
      result.setPart_list(this.part_list);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PartitionList(PartitionList other) {
    if (other.isSetPart_list()) {
      this.part_list = TBaseHelper.deepCopy(other.part_list);
    }
  }

  public PartitionList deepCopy() {
    return new PartitionList(this);
  }

  public List<Integer> getPart_list() {
    return this.part_list;
  }

  public PartitionList setPart_list(List<Integer> part_list) {
    this.part_list = part_list;
    return this;
  }

  public void unsetPart_list() {
    this.part_list = null;
  }

  // Returns true if field part_list is set (has been assigned a value) and false otherwise
  public boolean isSetPart_list() {
    return this.part_list != null;
  }

  public void setPart_listIsSet(boolean __value) {
    if (!__value) {
      this.part_list = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case PART_LIST:
      if (__value == null) {
        unsetPart_list();
      } else {
        setPart_list((List<Integer>)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case PART_LIST:
      return getPart_list();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof PartitionList))
      return false;
    PartitionList that = (PartitionList)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetPart_list(), that.isSetPart_list(), this.part_list, that.part_list)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {part_list});
  }

  @Override
  public int compareTo(PartitionList other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPart_list()).compareTo(other.isSetPart_list());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(part_list, other.part_list);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField __field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) { 
        break;
      }
      switch (__field.id)
      {
        case PART_LIST:
          if (__field.type == TType.LIST) {
            {
              TList _list156 = iprot.readListBegin();
              this.part_list = new ArrayList<Integer>(Math.max(0, _list156.size));
              for (int _i157 = 0; 
                   (_list156.size < 0) ? iprot.peekList() : (_i157 < _list156.size); 
                   ++_i157)
              {
                int _elem158;
                _elem158 = iprot.readI32();
                this.part_list.add(_elem158);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, __field.type);
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
    if (this.part_list != null) {
      oprot.writeFieldBegin(PART_LIST_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.I32, this.part_list.size()));
        for (int _iter159 : this.part_list)        {
          oprot.writeI32(_iter159);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
    String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("PartitionList");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("part_list");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getPart_list() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getPart_list(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

