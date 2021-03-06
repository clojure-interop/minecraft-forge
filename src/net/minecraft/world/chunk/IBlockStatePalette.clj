(ns net.minecraft.world.chunk.IBlockStatePalette
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.chunk IBlockStatePalette]))

(defn id-for
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^IBlockStatePalette this ^net.minecraft.block.state.IBlockState state]
    (-> this (.idFor state))))

(defn get-block-state
  "index-key - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^IBlockStatePalette this ^Integer index-key]
    (-> this (.getBlockState index-key))))

(defn read
  "buf - `net.minecraft.network.PacketBuffer`"
  ([^IBlockStatePalette this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.read buf))))

(defn write
  "buf - `net.minecraft.network.PacketBuffer`"
  ([^IBlockStatePalette this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.write buf))))

(defn get-serialized-state
  "returns: `int`"
  (^Integer [^IBlockStatePalette this]
    (-> this (.getSerializedState))))

