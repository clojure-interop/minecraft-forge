(ns net.minecraft.init.Blocks
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.init Blocks]))

(defn ->blocks
  "Constructor."
  (^Blocks []
    (new Blocks )))

(def *-air
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/AIR)

(def *-stone
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/STONE)

(def *-grass
  "Static Constant.

  type: net.minecraft.block.BlockGrass"
  Blocks/GRASS)

(def *-dirt
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/DIRT)

(def *-cobblestone
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/COBBLESTONE)

(def *-planks
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/PLANKS)

(def *-sapling
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/SAPLING)

(def *-bedrock
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/BEDROCK)

(def *-flowing-water
  "Static Constant.

  type: net.minecraft.block.BlockDynamicLiquid"
  Blocks/FLOWING_WATER)

(def *-water
  "Static Constant.

  type: net.minecraft.block.BlockStaticLiquid"
  Blocks/WATER)

(def *-flowing-lava
  "Static Constant.

  type: net.minecraft.block.BlockDynamicLiquid"
  Blocks/FLOWING_LAVA)

(def *-lava
  "Static Constant.

  type: net.minecraft.block.BlockStaticLiquid"
  Blocks/LAVA)

(def *-sand
  "Static Constant.

  type: net.minecraft.block.BlockSand"
  Blocks/SAND)

(def *-gravel
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/GRAVEL)

(def *-gold-ore
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/GOLD_ORE)

(def *-iron-ore
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/IRON_ORE)

(def *-coal-ore
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/COAL_ORE)

(def *-log
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/LOG)

(def *-log-2
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/LOG2)

(def *-leaves
  "Static Constant.

  type: net.minecraft.block.BlockLeaves"
  Blocks/LEAVES)

(def *-leaves-2
  "Static Constant.

  type: net.minecraft.block.BlockLeaves"
  Blocks/LEAVES2)

(def *-sponge
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/SPONGE)

(def *-glass
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/GLASS)

(def *-lapis-ore
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/LAPIS_ORE)

(def *-lapis-block
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/LAPIS_BLOCK)

(def *-dispenser
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/DISPENSER)

(def *-sandstone
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/SANDSTONE)

(def *-noteblock
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/NOTEBLOCK)

(def *-bed
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/BED)

(def *-golden-rail
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/GOLDEN_RAIL)

(def *-detector-rail
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/DETECTOR_RAIL)

(def *-sticky-piston
  "Static Constant.

  type: net.minecraft.block.BlockPistonBase"
  Blocks/STICKY_PISTON)

(def *-web
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/WEB)

(def *-tallgrass
  "Static Constant.

  type: net.minecraft.block.BlockTallGrass"
  Blocks/TALLGRASS)

(def *-deadbush
  "Static Constant.

  type: net.minecraft.block.BlockDeadBush"
  Blocks/DEADBUSH)

(def *-piston
  "Static Constant.

  type: net.minecraft.block.BlockPistonBase"
  Blocks/PISTON)

(def *-piston-head
  "Static Constant.

  type: net.minecraft.block.BlockPistonExtension"
  Blocks/PISTON_HEAD)

(def *-wool
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/WOOL)

(def *-piston-extension
  "Static Constant.

  type: net.minecraft.block.BlockPistonMoving"
  Blocks/PISTON_EXTENSION)

(def *-yellow-flower
  "Static Constant.

  type: net.minecraft.block.BlockFlower"
  Blocks/YELLOW_FLOWER)

(def *-red-flower
  "Static Constant.

  type: net.minecraft.block.BlockFlower"
  Blocks/RED_FLOWER)

(def *-brown-mushroom
  "Static Constant.

  type: net.minecraft.block.BlockBush"
  Blocks/BROWN_MUSHROOM)

(def *-red-mushroom
  "Static Constant.

  type: net.minecraft.block.BlockBush"
  Blocks/RED_MUSHROOM)

(def *-gold-block
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/GOLD_BLOCK)

(def *-iron-block
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/IRON_BLOCK)

(def *-double-stone-slab
  "Static Constant.

  type: net.minecraft.block.BlockSlab"
  Blocks/DOUBLE_STONE_SLAB)

(def *-stone-slab
  "Static Constant.

  type: net.minecraft.block.BlockSlab"
  Blocks/STONE_SLAB)

(def *-brick-block
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/BRICK_BLOCK)

(def *-tnt
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/TNT)

(def *-bookshelf
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/BOOKSHELF)

(def *-mossy-cobblestone
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/MOSSY_COBBLESTONE)

(def *-obsidian
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/OBSIDIAN)

(def *-torch
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/TORCH)

(def *-fire
  "Static Constant.

  type: net.minecraft.block.BlockFire"
  Blocks/FIRE)

(def *-mob-spawner
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/MOB_SPAWNER)

(def *-oak-stairs
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/OAK_STAIRS)

(def *-chest
  "Static Constant.

  type: net.minecraft.block.BlockChest"
  Blocks/CHEST)

(def *-redstone-wire
  "Static Constant.

  type: net.minecraft.block.BlockRedstoneWire"
  Blocks/REDSTONE_WIRE)

(def *-diamond-ore
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/DIAMOND_ORE)

(def *-diamond-block
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/DIAMOND_BLOCK)

(def *-crafting-table
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/CRAFTING_TABLE)

(def *-wheat
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/WHEAT)

(def *-farmland
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/FARMLAND)

(def *-furnace
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/FURNACE)

(def *-lit-furnace
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/LIT_FURNACE)

(def *-standing-sign
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/STANDING_SIGN)

(def *-oak-door
  "Static Constant.

  type: net.minecraft.block.BlockDoor"
  Blocks/OAK_DOOR)

(def *-spruce-door
  "Static Constant.

  type: net.minecraft.block.BlockDoor"
  Blocks/SPRUCE_DOOR)

(def *-birch-door
  "Static Constant.

  type: net.minecraft.block.BlockDoor"
  Blocks/BIRCH_DOOR)

(def *-jungle-door
  "Static Constant.

  type: net.minecraft.block.BlockDoor"
  Blocks/JUNGLE_DOOR)

(def *-acacia-door
  "Static Constant.

  type: net.minecraft.block.BlockDoor"
  Blocks/ACACIA_DOOR)

(def *-dark-oak-door
  "Static Constant.

  type: net.minecraft.block.BlockDoor"
  Blocks/DARK_OAK_DOOR)

(def *-ladder
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/LADDER)

(def *-rail
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/RAIL)

(def *-stone-stairs
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/STONE_STAIRS)

(def *-wall-sign
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/WALL_SIGN)

(def *-lever
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/LEVER)

(def *-stone-pressure-plate
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/STONE_PRESSURE_PLATE)

(def *-iron-door
  "Static Constant.

  type: net.minecraft.block.BlockDoor"
  Blocks/IRON_DOOR)

(def *-wooden-pressure-plate
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/WOODEN_PRESSURE_PLATE)

(def *-redstone-ore
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/REDSTONE_ORE)

(def *-lit-redstone-ore
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/LIT_REDSTONE_ORE)

(def *-unlit-redstone-torch
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/UNLIT_REDSTONE_TORCH)

(def *-redstone-torch
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/REDSTONE_TORCH)

(def *-stone-button
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/STONE_BUTTON)

(def *-snow-layer
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/SNOW_LAYER)

(def *-ice
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/ICE)

(def *-snow
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/SNOW)

(def *-cactus
  "Static Constant.

  type: net.minecraft.block.BlockCactus"
  Blocks/CACTUS)

(def *-clay
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/CLAY)

(def *-reeds
  "Static Constant.

  type: net.minecraft.block.BlockReed"
  Blocks/REEDS)

(def *-jukebox
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/JUKEBOX)

(def *-oak-fence
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/OAK_FENCE)

(def *-spruce-fence
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/SPRUCE_FENCE)

(def *-birch-fence
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/BIRCH_FENCE)

(def *-jungle-fence
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/JUNGLE_FENCE)

(def *-dark-oak-fence
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/DARK_OAK_FENCE)

(def *-acacia-fence
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/ACACIA_FENCE)

(def *-pumpkin
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/PUMPKIN)

(def *-netherrack
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/NETHERRACK)

(def *-soul-sand
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/SOUL_SAND)

(def *-glowstone
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/GLOWSTONE)

(def *-portal
  "Static Constant.

  type: net.minecraft.block.BlockPortal"
  Blocks/PORTAL)

(def *-lit-pumpkin
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/LIT_PUMPKIN)

(def *-cake
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/CAKE)

(def *-unpowered-repeater
  "Static Constant.

  type: net.minecraft.block.BlockRedstoneRepeater"
  Blocks/UNPOWERED_REPEATER)

(def *-powered-repeater
  "Static Constant.

  type: net.minecraft.block.BlockRedstoneRepeater"
  Blocks/POWERED_REPEATER)

(def *-trapdoor
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/TRAPDOOR)

(def *-monster-egg
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/MONSTER_EGG)

(def *-stonebrick
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/STONEBRICK)

(def *-brown-mushroom-block
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/BROWN_MUSHROOM_BLOCK)

(def *-red-mushroom-block
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/RED_MUSHROOM_BLOCK)

(def *-iron-bars
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/IRON_BARS)

(def *-glass-pane
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/GLASS_PANE)

(def *-melon-block
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/MELON_BLOCK)

(def *-pumpkin-stem
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/PUMPKIN_STEM)

(def *-melon-stem
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/MELON_STEM)

(def *-vine
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/VINE)

(def *-oak-fence-gate
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/OAK_FENCE_GATE)

(def *-spruce-fence-gate
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/SPRUCE_FENCE_GATE)

(def *-birch-fence-gate
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/BIRCH_FENCE_GATE)

(def *-jungle-fence-gate
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/JUNGLE_FENCE_GATE)

(def *-dark-oak-fence-gate
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/DARK_OAK_FENCE_GATE)

(def *-acacia-fence-gate
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/ACACIA_FENCE_GATE)

(def *-brick-stairs
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/BRICK_STAIRS)

(def *-stone-brick-stairs
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/STONE_BRICK_STAIRS)

(def *-mycelium
  "Static Constant.

  type: net.minecraft.block.BlockMycelium"
  Blocks/MYCELIUM)

(def *-waterlily
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/WATERLILY)

(def *-nether-brick
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/NETHER_BRICK)

(def *-nether-brick-fence
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/NETHER_BRICK_FENCE)

(def *-nether-brick-stairs
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/NETHER_BRICK_STAIRS)

(def *-nether-wart
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/NETHER_WART)

(def *-enchanting-table
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/ENCHANTING_TABLE)

(def *-brewing-stand
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/BREWING_STAND)

(def *-cauldron
  "Static Constant.

  type: net.minecraft.block.BlockCauldron"
  Blocks/CAULDRON)

(def *-end-portal
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/END_PORTAL)

(def *-end-portal-frame
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/END_PORTAL_FRAME)

(def *-end-stone
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/END_STONE)

(def *-dragon-egg
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/DRAGON_EGG)

(def *-redstone-lamp
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/REDSTONE_LAMP)

(def *-lit-redstone-lamp
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/LIT_REDSTONE_LAMP)

(def *-double-wooden-slab
  "Static Constant.

  type: net.minecraft.block.BlockSlab"
  Blocks/DOUBLE_WOODEN_SLAB)

(def *-wooden-slab
  "Static Constant.

  type: net.minecraft.block.BlockSlab"
  Blocks/WOODEN_SLAB)

(def *-cocoa
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/COCOA)

(def *-sandstone-stairs
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/SANDSTONE_STAIRS)

(def *-emerald-ore
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/EMERALD_ORE)

(def *-ender-chest
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/ENDER_CHEST)

(def *-tripwire-hook
  "Static Constant.

  type: net.minecraft.block.BlockTripWireHook"
  Blocks/TRIPWIRE_HOOK)

(def *-tripwire
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/TRIPWIRE)

(def *-emerald-block
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/EMERALD_BLOCK)

(def *-spruce-stairs
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/SPRUCE_STAIRS)

(def *-birch-stairs
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/BIRCH_STAIRS)

(def *-jungle-stairs
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/JUNGLE_STAIRS)

(def *-command-block
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/COMMAND_BLOCK)

(def *-beacon
  "Static Constant.

  type: net.minecraft.block.BlockBeacon"
  Blocks/BEACON)

(def *-cobblestone-wall
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/COBBLESTONE_WALL)

(def *-flower-pot
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/FLOWER_POT)

(def *-carrots
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/CARROTS)

(def *-potatoes
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/POTATOES)

(def *-wooden-button
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/WOODEN_BUTTON)

(def *-skull
  "Static Constant.

  type: net.minecraft.block.BlockSkull"
  Blocks/SKULL)

(def *-anvil
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/ANVIL)

(def *-trapped-chest
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/TRAPPED_CHEST)

(def *-light-weighted-pressure-plate
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/LIGHT_WEIGHTED_PRESSURE_PLATE)

(def *-heavy-weighted-pressure-plate
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/HEAVY_WEIGHTED_PRESSURE_PLATE)

(def *-unpowered-comparator
  "Static Constant.

  type: net.minecraft.block.BlockRedstoneComparator"
  Blocks/UNPOWERED_COMPARATOR)

(def *-powered-comparator
  "Static Constant.

  type: net.minecraft.block.BlockRedstoneComparator"
  Blocks/POWERED_COMPARATOR)

(def *-daylight-detector
  "Static Constant.

  type: net.minecraft.block.BlockDaylightDetector"
  Blocks/DAYLIGHT_DETECTOR)

(def *-daylight-detector-inverted
  "Static Constant.

  type: net.minecraft.block.BlockDaylightDetector"
  Blocks/DAYLIGHT_DETECTOR_INVERTED)

(def *-redstone-block
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/REDSTONE_BLOCK)

(def *-quartz-ore
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/QUARTZ_ORE)

(def *-hopper
  "Static Constant.

  type: net.minecraft.block.BlockHopper"
  Blocks/HOPPER)

(def *-quartz-block
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/QUARTZ_BLOCK)

(def *-quartz-stairs
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/QUARTZ_STAIRS)

(def *-activator-rail
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/ACTIVATOR_RAIL)

(def *-dropper
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/DROPPER)

(def *-stained-hardened-clay
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/STAINED_HARDENED_CLAY)

(def *-barrier
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/BARRIER)

(def *-iron-trapdoor
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/IRON_TRAPDOOR)

(def *-hay-block
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/HAY_BLOCK)

(def *-carpet
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/CARPET)

(def *-hardened-clay
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/HARDENED_CLAY)

(def *-coal-block
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/COAL_BLOCK)

(def *-packed-ice
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/PACKED_ICE)

(def *-acacia-stairs
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/ACACIA_STAIRS)

(def *-dark-oak-stairs
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/DARK_OAK_STAIRS)

(def *-slime-block
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/SLIME_BLOCK)

(def *-double-plant
  "Static Constant.

  type: net.minecraft.block.BlockDoublePlant"
  Blocks/DOUBLE_PLANT)

(def *-stained-glass
  "Static Constant.

  type: net.minecraft.block.BlockStainedGlass"
  Blocks/STAINED_GLASS)

(def *-stained-glass-pane
  "Static Constant.

  type: net.minecraft.block.BlockStainedGlassPane"
  Blocks/STAINED_GLASS_PANE)

(def *-prismarine
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/PRISMARINE)

(def *-sea-lantern
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/SEA_LANTERN)

(def *-standing-banner
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/STANDING_BANNER)

(def *-wall-banner
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/WALL_BANNER)

(def *-red-sandstone
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/RED_SANDSTONE)

(def *-red-sandstone-stairs
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/RED_SANDSTONE_STAIRS)

(def *-double-stone-slab-2
  "Static Constant.

  type: net.minecraft.block.BlockSlab"
  Blocks/DOUBLE_STONE_SLAB2)

(def *-stone-slab-2
  "Static Constant.

  type: net.minecraft.block.BlockSlab"
  Blocks/STONE_SLAB2)

(def *-end-rod
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/END_ROD)

(def *-chorus-plant
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/CHORUS_PLANT)

(def *-chorus-flower
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/CHORUS_FLOWER)

(def *-purpur-block
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/PURPUR_BLOCK)

(def *-purpur-pillar
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/PURPUR_PILLAR)

(def *-purpur-stairs
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/PURPUR_STAIRS)

(def *-purpur-double-slab
  "Static Constant.

  type: net.minecraft.block.BlockSlab"
  Blocks/PURPUR_DOUBLE_SLAB)

(def *-purpur-slab
  "Static Constant.

  type: net.minecraft.block.BlockSlab"
  Blocks/PURPUR_SLAB)

(def *-end-bricks
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/END_BRICKS)

(def *-beetroots
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/BEETROOTS)

(def *-grass-path
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/GRASS_PATH)

(def *-end-gateway
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/END_GATEWAY)

(def *-repeating-command-block
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/REPEATING_COMMAND_BLOCK)

(def *-chain-command-block
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/CHAIN_COMMAND_BLOCK)

(def *-frosted-ice
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/FROSTED_ICE)

(def *-magma
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/MAGMA)

(def *-nether-wart-block
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/NETHER_WART_BLOCK)

(def *-red-nether-brick
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/RED_NETHER_BRICK)

(def *-bone-block
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/BONE_BLOCK)

(def *-structure-void
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/STRUCTURE_VOID)

(def *-observer
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/OBSERVER)

(def *-white-shulker-box
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/WHITE_SHULKER_BOX)

(def *-orange-shulker-box
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/ORANGE_SHULKER_BOX)

(def *-magenta-shulker-box
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/MAGENTA_SHULKER_BOX)

(def *-light-blue-shulker-box
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/LIGHT_BLUE_SHULKER_BOX)

(def *-yellow-shulker-box
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/YELLOW_SHULKER_BOX)

(def *-lime-shulker-box
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/LIME_SHULKER_BOX)

(def *-pink-shulker-box
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/PINK_SHULKER_BOX)

(def *-gray-shulker-box
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/GRAY_SHULKER_BOX)

(def *-silver-shulker-box
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/SILVER_SHULKER_BOX)

(def *-cyan-shulker-box
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/CYAN_SHULKER_BOX)

(def *-purple-shulker-box
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/PURPLE_SHULKER_BOX)

(def *-blue-shulker-box
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/BLUE_SHULKER_BOX)

(def *-brown-shulker-box
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/BROWN_SHULKER_BOX)

(def *-green-shulker-box
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/GREEN_SHULKER_BOX)

(def *-red-shulker-box
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/RED_SHULKER_BOX)

(def *-black-shulker-box
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/BLACK_SHULKER_BOX)

(def *-structure-block
  "Static Constant.

  type: net.minecraft.block.Block"
  Blocks/STRUCTURE_BLOCK)

