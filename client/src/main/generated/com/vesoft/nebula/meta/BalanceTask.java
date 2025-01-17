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
public class BalanceTask implements TBase, java.io.Serializable, Cloneable, Comparable<BalanceTask> {
  private static final TStruct STRUCT_DESC = new TStruct("BalanceTask");
  private static final TField ID_FIELD_DESC = new TField("id", TType.STRING, (short)1);
  private static final TField COMMAND_FIELD_DESC = new TField("command", TType.STRING, (short)2);
  private static final TField RESULT_FIELD_DESC = new TField("result", TType.I32, (short)3);
  private static final TField START_TIME_FIELD_DESC = new TField("start_time", TType.I64, (short)4);
  private static final TField STOP_TIME_FIELD_DESC = new TField("stop_time", TType.I64, (short)5);

  public byte[] id;
  public byte[] command;
  /**
   * 
   * @see TaskResult
   */
  public TaskResult result;
  public long start_time;
  public long stop_time;
  public static final int ID = 1;
  public static final int COMMAND = 2;
  public static final int RESULT = 3;
  public static final int START_TIME = 4;
  public static final int STOP_TIME = 5;

  // isset id assignments
  private static final int __START_TIME_ISSET_ID = 0;
  private static final int __STOP_TIME_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(ID, new FieldMetaData("id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(COMMAND, new FieldMetaData("command", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(RESULT, new FieldMetaData("result", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(START_TIME, new FieldMetaData("start_time", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(STOP_TIME, new FieldMetaData("stop_time", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(BalanceTask.class, metaDataMap);
  }

  public BalanceTask() {
  }

  public BalanceTask(
      byte[] id,
      byte[] command,
      TaskResult result,
      long start_time,
      long stop_time) {
    this();
    this.id = id;
    this.command = command;
    this.result = result;
    this.start_time = start_time;
    setStart_timeIsSet(true);
    this.stop_time = stop_time;
    setStop_timeIsSet(true);
  }

  public static class Builder {
    private byte[] id;
    private byte[] command;
    private TaskResult result;
    private long start_time;
    private long stop_time;

    BitSet __optional_isset = new BitSet(2);

    public Builder() {
    }

    public Builder setId(final byte[] id) {
      this.id = id;
      return this;
    }

    public Builder setCommand(final byte[] command) {
      this.command = command;
      return this;
    }

    public Builder setResult(final TaskResult result) {
      this.result = result;
      return this;
    }

    public Builder setStart_time(final long start_time) {
      this.start_time = start_time;
      __optional_isset.set(__START_TIME_ISSET_ID, true);
      return this;
    }

    public Builder setStop_time(final long stop_time) {
      this.stop_time = stop_time;
      __optional_isset.set(__STOP_TIME_ISSET_ID, true);
      return this;
    }

    public BalanceTask build() {
      BalanceTask result = new BalanceTask();
      result.setId(this.id);
      result.setCommand(this.command);
      result.setResult(this.result);
      if (__optional_isset.get(__START_TIME_ISSET_ID)) {
        result.setStart_time(this.start_time);
      }
      if (__optional_isset.get(__STOP_TIME_ISSET_ID)) {
        result.setStop_time(this.stop_time);
      }
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BalanceTask(BalanceTask other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetId()) {
      this.id = TBaseHelper.deepCopy(other.id);
    }
    if (other.isSetCommand()) {
      this.command = TBaseHelper.deepCopy(other.command);
    }
    if (other.isSetResult()) {
      this.result = TBaseHelper.deepCopy(other.result);
    }
    this.start_time = TBaseHelper.deepCopy(other.start_time);
    this.stop_time = TBaseHelper.deepCopy(other.stop_time);
  }

  public BalanceTask deepCopy() {
    return new BalanceTask(this);
  }

  public byte[] getId() {
    return this.id;
  }

  public BalanceTask setId(byte[] id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  // Returns true if field id is set (has been assigned a value) and false otherwise
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean __value) {
    if (!__value) {
      this.id = null;
    }
  }

  public byte[] getCommand() {
    return this.command;
  }

  public BalanceTask setCommand(byte[] command) {
    this.command = command;
    return this;
  }

  public void unsetCommand() {
    this.command = null;
  }

  // Returns true if field command is set (has been assigned a value) and false otherwise
  public boolean isSetCommand() {
    return this.command != null;
  }

  public void setCommandIsSet(boolean __value) {
    if (!__value) {
      this.command = null;
    }
  }

  /**
   * 
   * @see TaskResult
   */
  public TaskResult getResult() {
    return this.result;
  }

  /**
   * 
   * @see TaskResult
   */
  public BalanceTask setResult(TaskResult result) {
    this.result = result;
    return this;
  }

  public void unsetResult() {
    this.result = null;
  }

  // Returns true if field result is set (has been assigned a value) and false otherwise
  public boolean isSetResult() {
    return this.result != null;
  }

  public void setResultIsSet(boolean __value) {
    if (!__value) {
      this.result = null;
    }
  }

  public long getStart_time() {
    return this.start_time;
  }

  public BalanceTask setStart_time(long start_time) {
    this.start_time = start_time;
    setStart_timeIsSet(true);
    return this;
  }

  public void unsetStart_time() {
    __isset_bit_vector.clear(__START_TIME_ISSET_ID);
  }

  // Returns true if field start_time is set (has been assigned a value) and false otherwise
  public boolean isSetStart_time() {
    return __isset_bit_vector.get(__START_TIME_ISSET_ID);
  }

  public void setStart_timeIsSet(boolean __value) {
    __isset_bit_vector.set(__START_TIME_ISSET_ID, __value);
  }

  public long getStop_time() {
    return this.stop_time;
  }

  public BalanceTask setStop_time(long stop_time) {
    this.stop_time = stop_time;
    setStop_timeIsSet(true);
    return this;
  }

  public void unsetStop_time() {
    __isset_bit_vector.clear(__STOP_TIME_ISSET_ID);
  }

  // Returns true if field stop_time is set (has been assigned a value) and false otherwise
  public boolean isSetStop_time() {
    return __isset_bit_vector.get(__STOP_TIME_ISSET_ID);
  }

  public void setStop_timeIsSet(boolean __value) {
    __isset_bit_vector.set(__STOP_TIME_ISSET_ID, __value);
  }

  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case ID:
      if (__value == null) {
        unsetId();
      } else {
        setId((byte[])__value);
      }
      break;

    case COMMAND:
      if (__value == null) {
        unsetCommand();
      } else {
        setCommand((byte[])__value);
      }
      break;

    case RESULT:
      if (__value == null) {
        unsetResult();
      } else {
        setResult((TaskResult)__value);
      }
      break;

    case START_TIME:
      if (__value == null) {
        unsetStart_time();
      } else {
        setStart_time((Long)__value);
      }
      break;

    case STOP_TIME:
      if (__value == null) {
        unsetStop_time();
      } else {
        setStop_time((Long)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case ID:
      return getId();

    case COMMAND:
      return getCommand();

    case RESULT:
      return getResult();

    case START_TIME:
      return new Long(getStart_time());

    case STOP_TIME:
      return new Long(getStop_time());

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
    if (!(_that instanceof BalanceTask))
      return false;
    BalanceTask that = (BalanceTask)_that;

    if (!TBaseHelper.equalsSlow(this.isSetId(), that.isSetId(), this.id, that.id)) { return false; }

    if (!TBaseHelper.equalsSlow(this.isSetCommand(), that.isSetCommand(), this.command, that.command)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetResult(), that.isSetResult(), this.result, that.result)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.start_time, that.start_time)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.stop_time, that.stop_time)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {id, command, result, start_time, stop_time});
  }

  @Override
  public int compareTo(BalanceTask other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(id, other.id);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetCommand()).compareTo(other.isSetCommand());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(command, other.command);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetResult()).compareTo(other.isSetResult());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(result, other.result);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetStart_time()).compareTo(other.isSetStart_time());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(start_time, other.start_time);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetStop_time()).compareTo(other.isSetStop_time());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(stop_time, other.stop_time);
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
        case ID:
          if (__field.type == TType.STRING) {
            this.id = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case COMMAND:
          if (__field.type == TType.STRING) {
            this.command = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case RESULT:
          if (__field.type == TType.I32) {
            this.result = TaskResult.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case START_TIME:
          if (__field.type == TType.I64) {
            this.start_time = iprot.readI64();
            setStart_timeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case STOP_TIME:
          if (__field.type == TType.I64) {
            this.stop_time = iprot.readI64();
            setStop_timeIsSet(true);
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
    if (this.id != null) {
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeBinary(this.id);
      oprot.writeFieldEnd();
    }
    if (this.command != null) {
      oprot.writeFieldBegin(COMMAND_FIELD_DESC);
      oprot.writeBinary(this.command);
      oprot.writeFieldEnd();
    }
    if (this.result != null) {
      oprot.writeFieldBegin(RESULT_FIELD_DESC);
      oprot.writeI32(this.result == null ? 0 : this.result.getValue());
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(START_TIME_FIELD_DESC);
    oprot.writeI64(this.start_time);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(STOP_TIME_FIELD_DESC);
    oprot.writeI64(this.stop_time);
    oprot.writeFieldEnd();
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
    StringBuilder sb = new StringBuilder("BalanceTask");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("id");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getId() == null) {
      sb.append("null");
    } else {
        int __id_size = Math.min(this.getId().length, 128);
        for (int i = 0; i < __id_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this.getId()[i]).length() > 1 ? Integer.toHexString(this.getId()[i]).substring(Integer.toHexString(this.getId()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this.getId()[i]).toUpperCase());
        }
        if (this.getId().length > 128) sb.append(" ...");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("command");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getCommand() == null) {
      sb.append("null");
    } else {
        int __command_size = Math.min(this.getCommand().length, 128);
        for (int i = 0; i < __command_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this.getCommand()[i]).length() > 1 ? Integer.toHexString(this.getCommand()[i]).substring(Integer.toHexString(this.getCommand()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this.getCommand()[i]).toUpperCase());
        }
        if (this.getCommand().length > 128) sb.append(" ...");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("result");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getResult() == null) {
      sb.append("null");
    } else {
      String result_name = this.getResult() == null ? "null" : this.getResult().name();
      if (result_name != null) {
        sb.append(result_name);
        sb.append(" (");
      }
      sb.append(this.getResult());
      if (result_name != null) {
        sb.append(")");
      }
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("start_time");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.getStart_time(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("stop_time");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.getStop_time(), indent + 1, prettyPrint));
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

