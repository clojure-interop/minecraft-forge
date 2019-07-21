(ns net.minecraftforge.common.util.BlockSnapshot
  "Represents a captured snapshot of a block which will not change
  automatically.

  Unlike Block, which only one object can exist per coordinate, BlockSnapshot
  can exist multiple times for any given Block."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.util BlockSnapshot]))

(defn ->block-snapshot
  "Constructor.

  Raw constructor designed for serialization usages.

  dimension - `int`
  pos - `net.minecraft.util.math.BlockPos`
  mod-id - `java.lang.String`
  block-name - `java.lang.String`
  meta - `int`
  flag - `int`
  nbt - `net.minecraft.nbt.NBTTagCompound`"
  (^BlockSnapshot [^Integer dimension ^net.minecraft.util.math.BlockPos pos ^java.lang.String mod-id ^java.lang.String block-name ^Integer meta ^Integer flag ^net.minecraft.nbt.NBTTagCompound nbt]
    (new BlockSnapshot dimension pos mod-id block-name meta flag nbt))
  (^BlockSnapshot [^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^net.minecraft.nbt.NBTTagCompound nbt]
    (new BlockSnapshot world pos state nbt))
  (^BlockSnapshot [^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (new BlockSnapshot world pos state)))

(defn *get-block-snapshot
  "world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  flag - `int`

  returns: `net.minecraftforge.common.util.BlockSnapshot`"
  (^net.minecraftforge.common.util.BlockSnapshot [^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^Integer flag]
    (BlockSnapshot/getBlockSnapshot world pos flag))
  (^net.minecraftforge.common.util.BlockSnapshot [^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos]
    (BlockSnapshot/getBlockSnapshot world pos)))

(defn *read-from-nbt
  "tag - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraftforge.common.util.BlockSnapshot`"
  (^net.minecraftforge.common.util.BlockSnapshot [^net.minecraft.nbt.NBTTagCompound tag]
    (BlockSnapshot/readFromNBT tag)))

(defn write-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^BlockSnapshot this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBT compound))))

(defn get-meta
  "returns: `int`"
  (^Integer [^BlockSnapshot this]
    (-> this (.getMeta))))

(defn set-world
  "world - `net.minecraft.world.World`"
  ([^BlockSnapshot this ^net.minecraft.world.World world]
    (-> this (.setWorld world))))

(defn set-replaced-block
  "replaced-block - `net.minecraft.block.state.IBlockState`"
  ([^BlockSnapshot this ^net.minecraft.block.state.IBlockState replaced-block]
    (-> this (.setReplacedBlock replaced-block))))

(defn get-dim-id
  "returns: `int`"
  (^Integer [^BlockSnapshot this]
    (-> this (.getDimId))))

(defn restore-to-location
  "world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  force - `boolean`
  apply-physics - `boolean`

  returns: `boolean`"
  (^Boolean [^BlockSnapshot this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^Boolean force ^Boolean apply-physics]
    (-> this (.restoreToLocation world pos force apply-physics))))

(defn get-tile-entity
  "returns: `net.minecraft.tileentity.TileEntity`"
  (^net.minecraft.tileentity.TileEntity [^BlockSnapshot this]
    (-> this (.getTileEntity))))

(defn get-flag
  "returns: `int`"
  (^Integer [^BlockSnapshot this]
    (-> this (.getFlag))))

(defn set-flag
  "flag - `int`"
  ([^BlockSnapshot this ^Integer flag]
    (-> this (.setFlag flag))))

(defn get-replaced-block
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockSnapshot this]
    (-> this (.getReplacedBlock))))

(defn get-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^BlockSnapshot this]
    (-> this (.getWorld))))

(defn get-registry-name
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^BlockSnapshot this]
    (-> this (.getRegistryName))))

(defn get-nbt
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^BlockSnapshot this]
    (-> this (.getNbt))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BlockSnapshot this]
    (-> this (.hashCode))))

(defn get-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^BlockSnapshot this]
    (-> this (.getPos))))

(defn get-current-block
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockSnapshot this]
    (-> this (.getCurrentBlock))))

(defn restore
  "force - `boolean`
  apply-physics - `boolean`

  returns: `boolean`"
  (^Boolean [^BlockSnapshot this ^Boolean force ^Boolean apply-physics]
    (-> this (.restore force apply-physics)))
  (^Boolean [^BlockSnapshot this ^Boolean force]
    (-> this (.restore force)))
  (^Boolean [^BlockSnapshot this]
    (-> this (.restore))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BlockSnapshot this ^java.lang.Object obj]
    (-> this (.equals obj))))

