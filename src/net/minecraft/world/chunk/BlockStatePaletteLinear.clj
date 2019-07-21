(ns net.minecraft.world.chunk.BlockStatePaletteLinear
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.chunk BlockStatePaletteLinear]))

(defn ->block-state-palette-linear
  "Constructor.

  bits-in - `int`
  resize-handler-in - `net.minecraft.world.chunk.IBlockStatePaletteResizer`"
  (^BlockStatePaletteLinear [^Integer bits-in ^net.minecraft.world.chunk.IBlockStatePaletteResizer resize-handler-in]
    (new BlockStatePaletteLinear bits-in resize-handler-in)))

(defn id-for
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockStatePaletteLinear this ^net.minecraft.block.state.IBlockState state]
    (-> this (.idFor state))))

(defn get-block-state
  "index-key - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockStatePaletteLinear this ^Integer index-key]
    (-> this (.getBlockState index-key))))

(defn read
  "buf - `net.minecraft.network.PacketBuffer`"
  ([^BlockStatePaletteLinear this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.read buf))))

(defn write
  "buf - `net.minecraft.network.PacketBuffer`"
  ([^BlockStatePaletteLinear this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.write buf))))

(defn get-serialized-state
  "returns: `int`"
  (^Integer [^BlockStatePaletteLinear this]
    (-> this (.getSerializedState))))

