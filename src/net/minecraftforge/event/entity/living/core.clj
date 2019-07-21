(ns net.minecraftforge.event.entity.living.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[net.minecraftforge.event.entity.living.BabyEntitySpawnEvent])
(require '[net.minecraftforge.event.entity.living.EnderTeleportEvent])
(require '[net.minecraftforge.event.entity.living.LivingAttackEvent])
(require '[net.minecraftforge.event.entity.living.LivingDeathEvent])
(require '[net.minecraftforge.event.entity.living.LivingDropsEvent])
(require '[net.minecraftforge.event.entity.living.LivingEntityUseItemEvent$Finish])
(require '[net.minecraftforge.event.entity.living.LivingEntityUseItemEvent$Start])
(require '[net.minecraftforge.event.entity.living.LivingEntityUseItemEvent$Stop])
(require '[net.minecraftforge.event.entity.living.LivingEntityUseItemEvent$Tick])
(require '[net.minecraftforge.event.entity.living.LivingEntityUseItemEvent])
(require '[net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent])
(require '[net.minecraftforge.event.entity.living.LivingEvent$LivingJumpEvent])
(require '[net.minecraftforge.event.entity.living.LivingEvent$LivingUpdateEvent])
(require '[net.minecraftforge.event.entity.living.LivingEvent])
(require '[net.minecraftforge.event.entity.living.LivingExperienceDropEvent])
(require '[net.minecraftforge.event.entity.living.LivingFallEvent])
(require '[net.minecraftforge.event.entity.living.LivingHealEvent])
(require '[net.minecraftforge.event.entity.living.LivingHurtEvent])
(require '[net.minecraftforge.event.entity.living.LivingPackSizeEvent])
(require '[net.minecraftforge.event.entity.living.LivingSetAttackTargetEvent])
(require '[net.minecraftforge.event.entity.living.LivingSpawnEvent$AllowDespawn])
(require '[net.minecraftforge.event.entity.living.LivingSpawnEvent$CheckSpawn])
(require '[net.minecraftforge.event.entity.living.LivingSpawnEvent$SpecialSpawn])
(require '[net.minecraftforge.event.entity.living.LivingSpawnEvent])
(require '[net.minecraftforge.event.entity.living.LootingLevelEvent])
(require '[net.minecraftforge.event.entity.living.PotionColorCalculationEvent])
(require '[net.minecraftforge.event.entity.living.ZombieEvent$SummonAidEvent])
(require '[net.minecraftforge.event.entity.living.ZombieEvent])