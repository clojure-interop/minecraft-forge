(ns net.minecraft.dispenser.IBlockSource
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.dispenser IBlockSource]))

(defn get-x
  "returns: `double`"
  (^Double [^IBlockSource this]
    (-> this (.getX))))

(defn get-y
  "returns: `double`"
  (^Double [^IBlockSource this]
    (-> this (.getY))))

(defn get-z
  "returns: `double`"
  (^Double [^IBlockSource this]
    (-> this (.getZ))))

(defn get-block-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^IBlockSource this]
    (-> this (.getBlockPos))))

(defn get-block-state
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^IBlockSource this]
    (-> this (.getBlockState))))

(defn get-block-tile-entity
  "returns: `<T extends net.minecraft.tileentity.TileEntity> T`"
  ([^IBlockSource this]
    (-> this (.getBlockTileEntity))))

