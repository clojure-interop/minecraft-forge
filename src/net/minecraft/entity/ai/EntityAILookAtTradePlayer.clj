(ns net.minecraft.entity.ai.EntityAILookAtTradePlayer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityAILookAtTradePlayer]))

(defn ->entity-ai-look-at-trade-player
  "Constructor.

  the-merchant-in - `net.minecraft.entity.passive.EntityVillager`"
  (^EntityAILookAtTradePlayer [^net.minecraft.entity.passive.EntityVillager the-merchant-in]
    (new EntityAILookAtTradePlayer the-merchant-in)))

(defn should-execute?
  "returns: `boolean`"
  (^Boolean [^EntityAILookAtTradePlayer this]
    (-> this (.shouldExecute))))

