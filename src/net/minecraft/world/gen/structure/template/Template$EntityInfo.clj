(ns net.minecraft.world.gen.structure.template.Template$EntityInfo
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure.template Template$EntityInfo]))

(defn ->entity-info
  "Constructor.

  vec-in - `net.minecraft.util.math.Vec3d`
  pos-in - `net.minecraft.util.math.BlockPos`
  compound-in - `net.minecraft.nbt.NBTTagCompound`"
  (^Template$EntityInfo [^net.minecraft.util.math.Vec3d vec-in ^net.minecraft.util.math.BlockPos pos-in ^net.minecraft.nbt.NBTTagCompound compound-in]
    (new Template$EntityInfo vec-in pos-in compound-in)))

(defn pos
  "Instance Constant.

  type: net.minecraft.util.math.Vec3d"
  (^net.minecraft.util.math.Vec3d [^Template$EntityInfo this]
    (-> this .-pos)))

(defn block-pos
  "Instance Constant.

  type: net.minecraft.util.math.BlockPos"
  (^net.minecraft.util.math.BlockPos [^Template$EntityInfo this]
    (-> this .-blockPos)))

(defn entity-data
  "Instance Constant.

  type: net.minecraft.nbt.NBTTagCompound"
  (^net.minecraft.nbt.NBTTagCompound [^Template$EntityInfo this]
    (-> this .-entityData)))

