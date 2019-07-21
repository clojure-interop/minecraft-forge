(ns net.minecraft.world.gen.structure.template.Template$BlockInfo
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure.template Template$BlockInfo]))

(defn ->block-info
  "Constructor.

  pos-in - `net.minecraft.util.math.BlockPos`
  state-in - `net.minecraft.block.state.IBlockState`
  compound-in - `net.minecraft.nbt.NBTTagCompound`"
  (^Template$BlockInfo [^net.minecraft.util.math.BlockPos pos-in ^net.minecraft.block.state.IBlockState state-in ^net.minecraft.nbt.NBTTagCompound compound-in]
    (new Template$BlockInfo pos-in state-in compound-in)))

(defn pos
  "Instance Constant.

  type: net.minecraft.util.math.BlockPos"
  (^net.minecraft.util.math.BlockPos [^Template$BlockInfo this]
    (-> this .-pos)))

(defn block-state
  "Instance Constant.

  type: net.minecraft.block.state.IBlockState"
  (^net.minecraft.block.state.IBlockState [^Template$BlockInfo this]
    (-> this .-blockState)))

(defn tileentity-data
  "Instance Constant.

  type: net.minecraft.nbt.NBTTagCompound"
  (^net.minecraft.nbt.NBTTagCompound [^Template$BlockInfo this]
    (-> this .-tileentityData)))

