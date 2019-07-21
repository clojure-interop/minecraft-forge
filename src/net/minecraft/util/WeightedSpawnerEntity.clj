(ns net.minecraft.util.WeightedSpawnerEntity
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util WeightedSpawnerEntity]))

(defn ->weighted-spawner-entity
  "Constructor.

  item-weight-in - `int`
  nbt-in - `net.minecraft.nbt.NBTTagCompound`"
  (^WeightedSpawnerEntity [^Integer item-weight-in ^net.minecraft.nbt.NBTTagCompound nbt-in]
    (new WeightedSpawnerEntity item-weight-in nbt-in))
  (^WeightedSpawnerEntity [^net.minecraft.nbt.NBTTagCompound nbt-in]
    (new WeightedSpawnerEntity nbt-in))
  (^WeightedSpawnerEntity []
    (new WeightedSpawnerEntity )))

(defn to-compound-tag
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^WeightedSpawnerEntity this]
    (-> this (.toCompoundTag))))

(defn get-nbt
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^WeightedSpawnerEntity this]
    (-> this (.getNbt))))

