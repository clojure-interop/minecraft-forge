(ns net.minecraftforge.event.entity.living.LivingEntityUseItemEvent$Stop
  "Fired when a player stops using an item without the use duration timing out.
  Example:
    Stop eating 1/2 way through
    Stop defending with sword
    Stop drawing bow. This case would fire the arrow

  Duration on this event is how long the item had left in it's count down before 'finishing'

  Canceling this event will prevent the Item from being notified that it has stopped being used,
  The only vanilla item this would effect are bows, and it would cause them NOT to fire there arrow."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.living LivingEntityUseItemEvent$Stop]))

(defn ->stop
  "Constructor.

  entity - `net.minecraft.entity.EntityLivingBase`
  item - `net.minecraft.item.ItemStack`
  duration - `int`"
  (^LivingEntityUseItemEvent$Stop [^net.minecraft.entity.EntityLivingBase entity ^net.minecraft.item.ItemStack item ^Integer duration]
    (new LivingEntityUseItemEvent$Stop entity item duration)))

