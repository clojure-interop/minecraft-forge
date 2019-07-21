(ns net.minecraftforge.event.entity.living.LivingEntityUseItemEvent$Start
  "Fired when a player starts 'using' an item, typically when they hold right mouse.
  Examples:
    Drawing a bow
    Eating Food
    Drinking Potions/Milk
    Guarding with a sword

  Cancel the event, or set the duration or <= 0 to prevent it from processing."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.living LivingEntityUseItemEvent$Start]))

(defn ->start
  "Constructor.

  entity - `net.minecraft.entity.EntityLivingBase`
  item - `net.minecraft.item.ItemStack`
  duration - `int`"
  (^LivingEntityUseItemEvent$Start [^net.minecraft.entity.EntityLivingBase entity ^net.minecraft.item.ItemStack item ^Integer duration]
    (new LivingEntityUseItemEvent$Start entity item duration)))

