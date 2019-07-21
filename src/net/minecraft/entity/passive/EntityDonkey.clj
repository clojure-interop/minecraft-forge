(ns net.minecraft.entity.passive.EntityDonkey
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive EntityDonkey]))

(defn ->entity-donkey
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityDonkey [^net.minecraft.world.World world-in]
    (new EntityDonkey world-in)))

(defn *register-fixes-donkey
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityDonkey/registerFixesDonkey fixer)))

(defn can-mate-with?
  "other-animal - `net.minecraft.entity.passive.EntityAnimal`

  returns: `boolean`"
  (^Boolean [^EntityDonkey this ^net.minecraft.entity.passive.EntityAnimal other-animal]
    (-> this (.canMateWith other-animal))))

(defn create-child
  "ageable - `net.minecraft.entity.EntityAgeable`

  returns: `net.minecraft.entity.EntityAgeable`"
  (^net.minecraft.entity.EntityAgeable [^EntityDonkey this ^net.minecraft.entity.EntityAgeable ageable]
    (-> this (.createChild ageable))))

