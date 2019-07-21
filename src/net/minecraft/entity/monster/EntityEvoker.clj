(ns net.minecraft.entity.monster.EntityEvoker
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.monster EntityEvoker]))

(defn ->entity-evoker
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityEvoker [^net.minecraft.world.World world-in]
    (new EntityEvoker world-in)))

(defn *register-fixes-evoker
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityEvoker/registerFixesEvoker fixer)))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityEvoker this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityEvoker this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn get-creature-attribute
  "returns: `net.minecraft.entity.EnumCreatureAttribute`"
  (^net.minecraft.entity.EnumCreatureAttribute [^EntityEvoker this]
    (-> this (.getCreatureAttribute))))

(defn casting-spell?
  "returns: `boolean`"
  (^Boolean [^EntityEvoker this]
    (-> this (.isCastingSpell))))

(defn set-is-casting-spell
  "p-190753-1 - `int`"
  ([^EntityEvoker this ^Integer p-190753-1]
    (-> this (.setIsCastingSpell p-190753-1))))

(defn on-update
  ""
  ([^EntityEvoker this]
    (-> this (.onUpdate))))

(defn on-same-team?
  "entity-in - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^EntityEvoker this ^net.minecraft.entity.Entity entity-in]
    (-> this (.isOnSameTeam entity-in))))

