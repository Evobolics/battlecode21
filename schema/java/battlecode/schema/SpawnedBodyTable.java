// automatically generated by the FlatBuffers compiler, do not modify

package battlecode.schema;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
/**
 * A list of new bodies to be placed on the map.
 */
public final class SpawnedBodyTable extends Table {
  public static SpawnedBodyTable getRootAsSpawnedBodyTable(ByteBuffer _bb) { return getRootAsSpawnedBodyTable(_bb, new SpawnedBodyTable()); }
  public static SpawnedBodyTable getRootAsSpawnedBodyTable(ByteBuffer _bb, SpawnedBodyTable obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public SpawnedBodyTable __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  /**
   * The numeric ID of the new bodies.
   * Will never be negative.
   * There will only be one body with a particular ID at a time.
   * So, there will never be two robots with the same ID, or a robot and
   * a building with the same ID.
   */
  public int robotIDs(int j) { int o = __offset(4); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int robotIDsLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer robotIDsAsByteBuffer() { return __vector_as_bytebuffer(4, 4); }
  public ByteBuffer robotIDsInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 4); }
  /**
   * The teams of the new bodies.
   */
  public byte teamIDs(int j) { int o = __offset(6); return o != 0 ? bb.get(__vector(o) + j * 1) : 0; }
  public int teamIDsLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer teamIDsAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer teamIDsInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  /**
   * The types of the new bodies.
   */
  public byte types(int j) { int o = __offset(8); return o != 0 ? bb.get(__vector(o) + j * 1) : 0; }
  public int typesLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer typesAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public ByteBuffer typesInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 1); }
  /**
   * The locations of the bodies.
   */
  public VecTable locs() { return locs(new VecTable()); }
  public VecTable locs(VecTable obj) { int o = __offset(10); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  /**
   * the amount of influence paid to create these bodies
   */
  public int cost(int j) { int o = __offset(12); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int costLength() { int o = __offset(12); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer costAsByteBuffer() { return __vector_as_bytebuffer(12, 4); }
  public ByteBuffer costInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 12, 4); }

  public static int createSpawnedBodyTable(FlatBufferBuilder builder,
      int robotIDsOffset,
      int teamIDsOffset,
      int typesOffset,
      int locsOffset,
      int costOffset) {
    builder.startObject(5);
    SpawnedBodyTable.addCost(builder, costOffset);
    SpawnedBodyTable.addLocs(builder, locsOffset);
    SpawnedBodyTable.addTypes(builder, typesOffset);
    SpawnedBodyTable.addTeamIDs(builder, teamIDsOffset);
    SpawnedBodyTable.addRobotIDs(builder, robotIDsOffset);
    return SpawnedBodyTable.endSpawnedBodyTable(builder);
  }

  public static void startSpawnedBodyTable(FlatBufferBuilder builder) { builder.startObject(5); }
  public static void addRobotIDs(FlatBufferBuilder builder, int robotIDsOffset) { builder.addOffset(0, robotIDsOffset, 0); }
  public static int createRobotIDsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startRobotIDsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addTeamIDs(FlatBufferBuilder builder, int teamIDsOffset) { builder.addOffset(1, teamIDsOffset, 0); }
  public static int createTeamIDsVector(FlatBufferBuilder builder, byte[] data) { builder.startVector(1, data.length, 1); for (int i = data.length - 1; i >= 0; i--) builder.addByte(data[i]); return builder.endVector(); }
  public static void startTeamIDsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static void addTypes(FlatBufferBuilder builder, int typesOffset) { builder.addOffset(2, typesOffset, 0); }
  public static int createTypesVector(FlatBufferBuilder builder, byte[] data) { builder.startVector(1, data.length, 1); for (int i = data.length - 1; i >= 0; i--) builder.addByte(data[i]); return builder.endVector(); }
  public static void startTypesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static void addLocs(FlatBufferBuilder builder, int locsOffset) { builder.addOffset(3, locsOffset, 0); }
  public static void addCost(FlatBufferBuilder builder, int costOffset) { builder.addOffset(4, costOffset, 0); }
  public static int createCostVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startCostVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endSpawnedBodyTable(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

