(ns net.minecraft.entity.passive.EntityCow
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive EntityCow]))

(defn ->entity-cow
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityCow [^net.minecraft.world.World world-in]
    (new EntityCow world-in)))

(defn *register-fixes-cow
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityCow/registerFixesCow fixer)))

(defn process-interact
  "player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^EntityCow this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (-> this (.processInteract player hand))))

(defn create-child
  "ageable - `net.minecraft.entity.EntityAgeable`

  returns: `net.minecraft.entity.passive.EntityCow`"
  (^net.minecraft.entity.passive.EntityCow [^EntityCow this ^net.minecraft.entity.EntityAgeable ageable]
    (-> this (.createChild ageable))))

(defn get-eye-height
  "returns: `float`"
  (^Float [^EntityCow this]
    (-> this (.getEyeHeight))))

