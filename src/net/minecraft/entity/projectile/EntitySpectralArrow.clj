(ns net.minecraft.entity.projectile.EntitySpectralArrow
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.projectile EntitySpectralArrow]))

(defn ->entity-spectral-arrow
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`"
  (^EntitySpectralArrow [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z]
    (new EntitySpectralArrow world-in x y z))
  (^EntitySpectralArrow [^net.minecraft.world.World world-in ^net.minecraft.entity.EntityLivingBase shooter]
    (new EntitySpectralArrow world-in shooter))
  (^EntitySpectralArrow [^net.minecraft.world.World world-in]
    (new EntitySpectralArrow world-in)))

(defn *register-fixes-spectral-arrow
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntitySpectralArrow/registerFixesSpectralArrow fixer)))

(defn on-update
  ""
  ([^EntitySpectralArrow this]
    (-> this (.onUpdate))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntitySpectralArrow this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntitySpectralArrow this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

