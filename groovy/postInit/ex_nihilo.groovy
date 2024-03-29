mods.jei.yeet(item('exnihilocreatio:block_waterwheel'))
mods.jei.yeet(item('exnihilocreatio:block_crucible_wood'))
mods.jei.yeet(item('exnihilocreatio:block_axle_stone'))
mods.jei.yeet(item('exnihilocreatio:block_grinder'))
mods.jei.yeet(item('exnihilocreatio:block_auto_sifter'))
mods.jei.yeet(item('exnihilocreatio:item_ore_gold', 1))
mods.jei.yeet(item('exnihilocreatio:item_ore_gold'))
mods.jei.yeet(item('exnihilocreatio:block_skystone_crushed'))
mods.jei.yeet(item('exnihilocreatio:item_ore_iron'))
mods.jei.yeet(item('exnihilocreatio:item_ore_iron', 1))
mods.jei.yeet(item('exnihilocreatio:block_crucible'))
mods.jei.yeet(item('exnihilocreatio:crook_stone'))
mods.jei.yeet(item('exnihilocreatio:crook_andesite'))
mods.jei.yeet(item('exnihilocreatio:crook_granite'))
mods.jei.yeet(item('exnihilocreatio:crook_diorite'))
mods.jei.yeet(item('exnihilocreatio:crook_gold'))
mods.jei.yeet(item('exnihilocreatio:crook_iron'))
mods.jei.yeet(item('exnihilocreatio:crook_diamond'))
mods.jei.yeet(item('exnihilocreatio:crook_bone'))
mods.jei.yeet(item('exnihilocreatio:crook_clay_uncooked'))
mods.jei.yeet(item('exnihilocreatio:crook_clay'))
mods.jei.yeet(item('exnihilocreatio:crook_prismarine'))
mods.jei.yeet(item('exnihilocreatio:crook_netherrack'))
mods.jei.yeet(item('exnihilocreatio:crook_purpur'))
mods.jei.yeet(item('exnihilocreatio:crook_blaze'))
mods.jei.yeet(item('exnihilocreatio:item_material', 1))
mods.jei.yeet(item('exnihilocreatio:hammer_diamond'))
mods.jei.yeet(item('exnihilocreatio:hammer_gold'))
mods.jei.yeet(item('exnihilocreatio:item_material', 7))
mods.jei.yeet(item('exnihilocreatio:item_material', 6))
crafting.removeByOutput(item('exnihilocreatio:block_end_cake'))

crafting.addShaped('end_cake', item('exnihilocreatio:block_end_cake'), [
 [item('minecraft:ender_eye'), metaitem('quantumeye'), item('minecraft:ender_eye')],
 [item('minecraft:ender_eye'), item('minecraft:cake'), item('minecraft:ender_eye')],
 [item('minecraft:ender_eye'), metaitem('quantumeye'), item('minecraft:ender_eye')]])

crafting.addShaped('crucible', item('exnihilocreatio:block_crucible', 1), [
 [item('minecraft:brick'), null, item('minecraft:brick')],
 [item('minecraft:brick'), null, item('minecraft:brick')],
 [item('minecraft:brick'), item('minecraft:brick'), item('minecraft:brick')]])
furnace.removeByInput(item('exnihilocreatio:block_crucible'))

mods.gregtech.chemical_bath.recipeBuilder()
  .inputs(item('minecraft:redstone'))
  .fluidInputs(fluid('lava')*1000)
  .outputs(item('minecraft:netherrack'))
  .EUt(30)
  .duration(8)
  .buildAndRegister()

mods.gregtech.chemical_bath.recipeBuilder()
  .inputs(item('minecraft:glowstone_dust'))
  .fluidInputs(fluid('deuterium')*1000)
  .outputs(item('minecraft:end_stone'))
  .EUt(30)
  .duration(8)
  .buildAndRegister()

mods.gregtech.chemical_bath.recipeBuilder()
  .inputs(item('exnihilocreatio:block_dust'))
  .fluidInputs(fluid('water')*1000)
  .outputs(item('minecraft:clay'))
  .EUt(30)
  .duration(8)
  .buildAndRegister()

mods.gregtech.chemical_bath.recipeBuilder()
  .inputs(ore('sand'))
  .fluidInputs(fluid('witchwater')*1000)
  .outputs(item('minecraft:soul_sand'))
  .EUt(30)
  .duration(8)  
  .buildAndRegister()

mods.gregtech.chemical_bath.recipeBuilder()
  .inputs(item('exnihilocreatio:item_material', 3))
  .fluidInputs(fluid('water')*1000)
  .fluidOutputs(fluid('witchwater')*1000)
  .EUt(120)
  .duration(150)
  .buildAndRegister()
