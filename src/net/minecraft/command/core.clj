(ns net.minecraft.command.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[net.minecraft.command.CommandBase$CoordinateArg])
(require '[net.minecraft.command.CommandBase])
(require '[net.minecraft.command.CommandBlockData])
(require '[net.minecraft.command.CommandClearInventory])
(require '[net.minecraft.command.CommandClone])
(require '[net.minecraft.command.CommandCompare])
(require '[net.minecraft.command.CommandDebug])
(require '[net.minecraft.command.CommandDefaultGameMode])
(require '[net.minecraft.command.CommandDifficulty])
(require '[net.minecraft.command.CommandEffect])
(require '[net.minecraft.command.CommandEnchant])
(require '[net.minecraft.command.CommandEntityData])
(require '[net.minecraft.command.CommandException])
(require '[net.minecraft.command.CommandExecuteAt])
(require '[net.minecraft.command.CommandFill])
(require '[net.minecraft.command.CommandGameMode])
(require '[net.minecraft.command.CommandGameRule])
(require '[net.minecraft.command.CommandGive])
(require '[net.minecraft.command.CommandHandler])
(require '[net.minecraft.command.CommandHelp])
(require '[net.minecraft.command.CommandKill])
(require '[net.minecraft.command.CommandLocate])
(require '[net.minecraft.command.CommandNotFoundException])
(require '[net.minecraft.command.CommandParticle])
(require '[net.minecraft.command.CommandPlaySound])
(require '[net.minecraft.command.CommandReplaceItem])
(require '[net.minecraft.command.CommandResultStats$Type])
(require '[net.minecraft.command.CommandResultStats])
(require '[net.minecraft.command.CommandServerKick])
(require '[net.minecraft.command.CommandSetPlayerTimeout])
(require '[net.minecraft.command.CommandSetSpawnpoint])
(require '[net.minecraft.command.CommandShowSeed])
(require '[net.minecraft.command.CommandSpreadPlayers])
(require '[net.minecraft.command.CommandStats])
(require '[net.minecraft.command.CommandStopSound])
(require '[net.minecraft.command.CommandTP])
(require '[net.minecraft.command.CommandTime])
(require '[net.minecraft.command.CommandTitle])
(require '[net.minecraft.command.CommandToggleDownfall])
(require '[net.minecraft.command.CommandTrigger])
(require '[net.minecraft.command.CommandWeather])
(require '[net.minecraft.command.CommandWorldBorder])
(require '[net.minecraft.command.CommandXP])
(require '[net.minecraft.command.EntityNotFoundException])
(require '[net.minecraft.command.EntitySelector])
(require '[net.minecraft.command.ICommand])
(require '[net.minecraft.command.ICommandListener])
(require '[net.minecraft.command.ICommandManager])
(require '[net.minecraft.command.ICommandSender])
(require '[net.minecraft.command.InvalidBlockStateException])
(require '[net.minecraft.command.NumberInvalidException])
(require '[net.minecraft.command.PlayerNotFoundException])
(require '[net.minecraft.command.ServerCommandManager])
(require '[net.minecraft.command.SyntaxErrorException])
(require '[net.minecraft.command.WrongUsageException])