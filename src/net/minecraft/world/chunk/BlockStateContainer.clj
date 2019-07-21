(ns net.minecraft.world.chunk.BlockStateContainer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.chunk BlockStateContainer]))

(defn ->block-state-container
  "Constructor."
  (^BlockStateContainer []
    (new BlockStateContainer )))

(defn on-resize
  "bits - `int`
  state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockStateContainer this ^Integer bits ^net.minecraft.block.state.IBlockState state]
    (-> this (.onResize bits state))))

(defn set
  "x - `int`
  y - `int`
  z - `int`
  state - `net.minecraft.block.state.IBlockState`"
  ([^BlockStateContainer this ^Integer x ^Integer y ^Integer z ^net.minecraft.block.state.IBlockState state]
    (-> this (.set x y z state))))

(defn get
  "x - `int`
  y - `int`
  z - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockStateContainer this ^Integer x ^Integer y ^Integer z]
    (-> this (.get x y z))))

(defn read
  "buf - `net.minecraft.network.PacketBuffer`"
  ([^BlockStateContainer this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.read buf))))

(defn write
  "buf - `net.minecraft.network.PacketBuffer`"
  ([^BlockStateContainer this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.write buf))))

(defn get-data-for-nbt
  "p-186017-1 - `byte[]`
  p-186017-2 - `net.minecraft.world.chunk.NibbleArray`

  returns: `net.minecraft.world.chunk.NibbleArray`"
  (^net.minecraft.world.chunk.NibbleArray [^BlockStateContainer this p-186017-1 ^net.minecraft.world.chunk.NibbleArray p-186017-2]
    (-> this (.getDataForNBT p-186017-1 p-186017-2))))

(defn set-data-from-nbt
  "p-186019-1 - `byte[]`
  p-186019-2 - `net.minecraft.world.chunk.NibbleArray`
  p-186019-3 - `net.minecraft.world.chunk.NibbleArray`"
  ([^BlockStateContainer this p-186019-1 ^net.minecraft.world.chunk.NibbleArray p-186019-2 ^net.minecraft.world.chunk.NibbleArray p-186019-3]
    (-> this (.setDataFromNBT p-186019-1 p-186019-2 p-186019-3))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^BlockStateContainer this]
    (-> this (.getSerializedSize))))

