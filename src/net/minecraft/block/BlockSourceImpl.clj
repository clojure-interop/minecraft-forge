(ns net.minecraft.block.BlockSourceImpl
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockSourceImpl]))

(defn ->block-source-impl
  "Constructor.

  world-in - `net.minecraft.world.World`
  pos-in - `net.minecraft.util.math.BlockPos`"
  (^BlockSourceImpl [^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos-in]
    (new BlockSourceImpl world-in pos-in)))

(defn get-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^BlockSourceImpl this]
    (-> this (.getWorld))))

(defn get-x
  "returns: `double`"
  (^Double [^BlockSourceImpl this]
    (-> this (.getX))))

(defn get-y
  "returns: `double`"
  (^Double [^BlockSourceImpl this]
    (-> this (.getY))))

(defn get-z
  "returns: `double`"
  (^Double [^BlockSourceImpl this]
    (-> this (.getZ))))

(defn get-block-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^BlockSourceImpl this]
    (-> this (.getBlockPos))))

(defn get-block-state
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockSourceImpl this]
    (-> this (.getBlockState))))

(defn get-block-tile-entity
  "returns: `<T extends net.minecraft.tileentity.TileEntity> T`"
  ([^BlockSourceImpl this]
    (-> this (.getBlockTileEntity))))

