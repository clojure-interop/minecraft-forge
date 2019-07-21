(ns net.minecraftforge.items.wrapper.PlayerOffhandInvWrapper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.items.wrapper PlayerOffhandInvWrapper]))

(defn ->player-offhand-inv-wrapper
  "Constructor.

  inv - `net.minecraft.entity.player.InventoryPlayer`"
  (^PlayerOffhandInvWrapper [^net.minecraft.entity.player.InventoryPlayer inv]
    (new PlayerOffhandInvWrapper inv)))

