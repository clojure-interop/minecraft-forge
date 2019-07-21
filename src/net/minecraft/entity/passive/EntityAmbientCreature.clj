(ns net.minecraft.entity.passive.EntityAmbientCreature
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive EntityAmbientCreature]))

(defn ->entity-ambient-creature
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityAmbientCreature [^net.minecraft.world.World world-in]
    (new EntityAmbientCreature world-in)))

(defn can-be-leashed-to?
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^EntityAmbientCreature this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.canBeLeashedTo player))))

