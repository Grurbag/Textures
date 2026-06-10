// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelForestGoblinChestplate extends EntityModel<Entity> {
	private final ModelRenderer bodyArmour;
	private final ModelRenderer bone9;
	private final ModelRenderer bone8;
	private final ModelRenderer bone7;
	private final ModelRenderer bone6;
	private final ModelRenderer bone5;
	private final ModelRenderer bone4;
	private final ModelRenderer bone3;
	private final ModelRenderer bone2;
	private final ModelRenderer bone;
	private final ModelRenderer bodyArmour2;
	private final ModelRenderer leftHandArmour;
	private final ModelRenderer bone16;
	private final ModelRenderer leftHandArmour2;
	private final ModelRenderer rightHandArmour;
	private final ModelRenderer bone15;
	private final ModelRenderer rightHandArmour2;

	public WFMModelForestGoblinChestplate() {
		texWidth = 64;
		texHeight = 64;

		bodyArmour = new ModelRenderer(this);
		bodyArmour.setPos(0.0F, 10.0F, 1.0F);
		bodyArmour.texOffs(16, 25).addBox(-4.0F, -5.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.5F, false);

		bone9 = new ModelRenderer(this);
		bone9.setPos(-1.0F, 1.0F, 2.5F);
		bodyArmour.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 3.1416F, 0.0F);
		bone9.texOffs(25, 0).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		bone9.texOffs(43, 0).addBox(-5.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone9.texOffs(43, 0).addBox(-5.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone9.texOffs(43, 0).addBox(4.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone9.texOffs(43, 0).addBox(4.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setPos(0.0F, -6.5F, 1.5F);
		bodyArmour.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 3.1416F, 0.0F);
		bone8.texOffs(25, 0).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		bone8.texOffs(43, 0).addBox(-5.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone8.texOffs(43, 0).addBox(-5.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone8.texOffs(43, 0).addBox(4.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone8.texOffs(43, 0).addBox(4.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setPos(1.0F, -5.0F, 2.25F);
		bodyArmour.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 3.1416F, 0.0F);
		bone7.texOffs(27, 0).addBox(-2.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone7.texOffs(43, 0).addBox(-3.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone7.texOffs(43, 0).addBox(-3.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone7.texOffs(43, 0).addBox(4.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone7.texOffs(43, 0).addBox(4.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setPos(-0.25F, -3.5F, 3.5F);
		bodyArmour.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 3.1416F, 0.0F);
		bone6.texOffs(25, 0).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		bone6.texOffs(43, 0).addBox(-5.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone6.texOffs(43, 0).addBox(-5.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone6.texOffs(43, 0).addBox(4.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone6.texOffs(43, 0).addBox(4.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setPos(0.0F, -1.0F, 3.0F);
		bodyArmour.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 3.1416F, 0.0F);
		bone5.texOffs(27, 0).addBox(-2.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone5.texOffs(43, 0).addBox(-3.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone5.texOffs(43, 0).addBox(-3.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone5.texOffs(43, 0).addBox(4.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone5.texOffs(43, 0).addBox(4.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setPos(0.0F, 2.0F, -3.0F);
		bodyArmour.addChild(bone4);
		bone4.texOffs(27, 0).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone4.texOffs(43, 0).addBox(-3.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone4.texOffs(43, 0).addBox(-3.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone4.texOffs(43, 0).addBox(2.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone4.texOffs(43, 0).addBox(2.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setPos(0.0F, 0.5F, -2.5F);
		bodyArmour.addChild(bone3);
		bone3.texOffs(26, 0).addBox(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, 0.0F, true);
		bone3.texOffs(43, 0).addBox(-4.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		bone3.texOffs(43, 0).addBox(-4.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		bone3.texOffs(43, 0).addBox(3.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		bone3.texOffs(43, 0).addBox(3.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		bone2 = new ModelRenderer(this);
		bone2.setPos(0.0F, -1.0F, -3.75F);
		bodyArmour.addChild(bone2);
		bone2.texOffs(26, 0).addBox(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.texOffs(43, 0).addBox(-5.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.texOffs(43, 0).addBox(-4.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.texOffs(43, 0).addBox(4.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.texOffs(43, 0).addBox(3.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setPos(0.0F, -2.5F, -4.5F);
		bodyArmour.addChild(bone);
		bone.texOffs(25, 0).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, 0.0F, true);
		bone.texOffs(43, 0).addBox(-5.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		bone.texOffs(43, 0).addBox(-4.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		bone.texOffs(43, 0).addBox(4.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		bone.texOffs(43, 0).addBox(3.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		bodyArmour2 = new ModelRenderer(this);
		bodyArmour2.setPos(0.0F, -10.0F, -1.0F);
		bodyArmour.addChild(bodyArmour2);
		bodyArmour2.texOffs(15, 15).addBox(-4.0F, 3.0F, -3.0F, 8.0F, 5.0F, 5.0F, 0.49F, false);

		leftHandArmour = new ModelRenderer(this);
		leftHandArmour.setPos(5.0F, 6.0F, -1.0F);
		leftHandArmour.texOffs(41, 16).addBox(-1.0F, -1.0F, -2.0F, 3.0F, 11.0F, 4.0F, 0.5F, true);

		bone16 = new ModelRenderer(this);
		bone16.setPos(2.6507F, 2.0658F, -0.2209F);
		leftHandArmour.addChild(bone16);
		setRotationAngle(bone16, 1.343F, -0.6102F, -1.453F);
		bone16.texOffs(27, 0).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone16.texOffs(43, 0).addBox(-3.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone16.texOffs(43, 0).addBox(-3.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone16.texOffs(43, 0).addBox(2.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone16.texOffs(43, 0).addBox(2.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		leftHandArmour2 = new ModelRenderer(this);
		leftHandArmour2.setPos(0.0F, -3.0F, 0.0F);
		leftHandArmour.addChild(leftHandArmour2);
		leftHandArmour2.texOffs(41, 31).addBox(-1.0F, 2.0F, -2.0F, 3.0F, 11.0F, 4.0F, 0.3F, true);

		rightHandArmour = new ModelRenderer(this);
		rightHandArmour.setPos(-5.0F, 6.0F, -1.0F);
		rightHandArmour.texOffs(41, 16).addBox(-2.0F, -1.0F, -2.0F, 3.0F, 11.0F, 4.0F, 0.5F, false);

		bone15 = new ModelRenderer(this);
		bone15.setPos(-2.6251F, 1.5396F, -0.1963F);
		rightHandArmour.addChild(bone15);
		setRotationAngle(bone15, -1.6258F, 0.6538F, -1.517F);
		bone15.texOffs(27, 0).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone15.texOffs(43, 0).addBox(-3.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone15.texOffs(43, 0).addBox(-3.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone15.texOffs(43, 0).addBox(2.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone15.texOffs(43, 0).addBox(2.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		rightHandArmour2 = new ModelRenderer(this);
		rightHandArmour2.setPos(0.0F, -3.0F, 0.0F);
		rightHandArmour.addChild(rightHandArmour2);
		rightHandArmour2.texOffs(41, 31).addBox(-2.0F, 2.0F, -2.0F, 3.0F, 11.0F, 4.0F, 0.3F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bodyArmour.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftHandArmour.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightHandArmour.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}