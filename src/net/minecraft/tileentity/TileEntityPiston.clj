(ns net.minecraft.tileentity.TileEntityPiston
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity TileEntityPiston]))

(defn ->tile-entity-piston
  "Constructor.

  piston-state-in - `net.minecraft.block.state.IBlockState`
  piston-facing-in - `net.minecraft.util.EnumFacing`
  extending-in - `boolean`
  should-head-be-rendered-in - `boolean`"
  (^TileEntityPiston [^net.minecraft.block.state.IBlockState piston-state-in ^net.minecraft.util.EnumFacing piston-facing-in ^Boolean extending-in ^Boolean should-head-be-rendered-in]
    (new TileEntityPiston piston-state-in piston-facing-in extending-in should-head-be-rendered-in))
  (^TileEntityPiston []
    (new TileEntityPiston )))

(defn *register-fixes-piston
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (TileEntityPiston/registerFixesPiston fixer)))

(defn extending?
  "returns: `boolean`"
  (^Boolean [^TileEntityPiston this]
    (-> this (.isExtending))))

(defn write-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntityPiston this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBT compound))))

(defn get-facing
  "returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^TileEntityPiston this]
    (-> this (.getFacing))))

(defn read-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^TileEntityPiston this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readFromNBT compound))))

(defn get-offset-z
  "ticks - `float`

  returns: `float`"
  (^Float [^TileEntityPiston this ^Float ticks]
    (-> this (.getOffsetZ ticks))))

(defn get-aabb
  "p-184319-1 - `net.minecraft.world.IBlockAccess`
  p-184319-2 - `net.minecraft.util.math.BlockPos`
  p-184319-3 - `float`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^TileEntityPiston this ^net.minecraft.world.IBlockAccess p-184319-1 ^net.minecraft.util.math.BlockPos p-184319-2 ^Float p-184319-3]
    (-> this (.getAABB p-184319-1 p-184319-2 p-184319-3)))
  (^net.minecraft.util.math.AxisAlignedBB [^TileEntityPiston this ^net.minecraft.world.IBlockAccess p-184321-1 ^net.minecraft.util.math.BlockPos p-184321-2]
    (-> this (.getAABB p-184321-1 p-184321-2))))

(defn clear-piston-tile-entity
  ""
  ([^TileEntityPiston this]
    (-> this (.clearPistonTileEntity))))

(defn get-update-tag
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntityPiston this]
    (-> this (.getUpdateTag))))

(defn should-piston-head-be-rendered?
  "returns: `boolean`"
  (^Boolean [^TileEntityPiston this]
    (-> this (.shouldPistonHeadBeRendered))))

(defn get-block-metadata
  "returns: `int`"
  (^Integer [^TileEntityPiston this]
    (-> this (.getBlockMetadata))))

(defn get-progress
  "ticks - `float`

  returns: `float`"
  (^Float [^TileEntityPiston this ^Float ticks]
    (-> this (.getProgress ticks))))

(defn update
  ""
  ([^TileEntityPiston this]
    (-> this (.update))))

(defn get-piston-state
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^TileEntityPiston this]
    (-> this (.getPistonState))))

(defn get-offset-x
  "ticks - `float`

  returns: `float`"
  (^Float [^TileEntityPiston this ^Float ticks]
    (-> this (.getOffsetX ticks))))

(defn get-offset-y
  "ticks - `float`

  returns: `float`"
  (^Float [^TileEntityPiston this ^Float ticks]
    (-> this (.getOffsetY ticks))))

(defn add-collission-aab-bs
  "p-190609-1 - `net.minecraft.world.World`
  p-190609-2 - `net.minecraft.util.math.BlockPos`
  p-190609-3 - `net.minecraft.util.math.AxisAlignedBB`
  p-190609-4 - `java.util.List`
  p-190609-5 - `net.minecraft.entity.Entity`"
  ([^TileEntityPiston this ^net.minecraft.world.World p-190609-1 ^net.minecraft.util.math.BlockPos p-190609-2 ^net.minecraft.util.math.AxisAlignedBB p-190609-3 ^java.util.List p-190609-4 ^net.minecraft.entity.Entity p-190609-5]
    (-> this (.addCollissionAABBs p-190609-1 p-190609-2 p-190609-3 p-190609-4 p-190609-5))))

