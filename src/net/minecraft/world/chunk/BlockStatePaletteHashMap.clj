(ns net.minecraft.world.chunk.BlockStatePaletteHashMap
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.chunk BlockStatePaletteHashMap]))

(defn ->block-state-palette-hash-map
  "Constructor.

  bits-in - `int`
  palette-resizer-in - `net.minecraft.world.chunk.IBlockStatePaletteResizer`"
  (^BlockStatePaletteHashMap [^Integer bits-in ^net.minecraft.world.chunk.IBlockStatePaletteResizer palette-resizer-in]
    (new BlockStatePaletteHashMap bits-in palette-resizer-in)))

(defn id-for
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockStatePaletteHashMap this ^net.minecraft.block.state.IBlockState state]
    (-> this (.idFor state))))

(defn get-block-state
  "index-key - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockStatePaletteHashMap this ^Integer index-key]
    (-> this (.getBlockState index-key))))

(defn read
  "buf - `net.minecraft.network.PacketBuffer`"
  ([^BlockStatePaletteHashMap this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.read buf))))

(defn write
  "buf - `net.minecraft.network.PacketBuffer`"
  ([^BlockStatePaletteHashMap this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.write buf))))

(defn get-serialized-state
  "returns: `int`"
  (^Integer [^BlockStatePaletteHashMap this]
    (-> this (.getSerializedState))))

