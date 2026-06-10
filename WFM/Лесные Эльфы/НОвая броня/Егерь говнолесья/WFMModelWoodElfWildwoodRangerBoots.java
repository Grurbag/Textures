// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelWoodElfWildwoodRangerBoots extends EntityModel<Entity> {
	private final ModelRenderer rightBoot;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer RightLeg_r1;
	private final ModelRenderer leftBoot;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer RightLeg_r2;

	public WFMModelWoodElfWildwoodRangerBoots() {
		texWidth = 64;
		texHeight = 64;

		rightBoot = new ModelRenderer(this);
		rightBoot.setPos(-1.9F, 12.0F, 0.0F);
		rightBoot.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.4F, 7.0F, -2.0F);
		rightBoot.addChild(cube_r1);
		setRotationAngle(cube_r1, 2.3562F, 1.2654F, 1.5708F);
		cube_r1.texOffs(21, 57).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.4F, 9.0F, -2.0F);
		rightBoot.addChild(cube_r2);
		setRotationAngle(cube_r2, 2.3562F, 1.2654F, 1.5708F);
		cube_r2.texOffs(11, 57).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(0.4F, 11.0F, -2.0F);
		rightBoot.addChild(cube_r3);
		setRotationAngle(cube_r3, 2.3562F, 1.2654F, 1.5708F);
		cube_r3.texOffs(1, 57).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);

		RightLeg_r1 = new ModelRenderer(this);
		RightLeg_r1.setPos(0.0F, 11.5F, -3.0F);
		rightBoot.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, 0.0873F, 0.0F, 0.0F);
		RightLeg_r1.texOffs(0, 32).addBox(-2.5F, -1.0F, -0.35F, 5.0F, 2.0F, 1.0F, 0.0F, false);

		leftBoot = new ModelRenderer(this);
		leftBoot.setPos(1.9F, 12.0F, 0.0F);
		leftBoot.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(1.1F, 7.0F, -2.0F);
		leftBoot.addChild(cube_r4);
		setRotationAngle(cube_r4, 2.3562F, 1.2654F, 1.5708F);
		cube_r4.texOffs(21, 57).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(1.1F, 9.0F, -2.0F);
		leftBoot.addChild(cube_r5);
		setRotationAngle(cube_r5, 2.3562F, 1.2654F, 1.5708F);
		cube_r5.texOffs(11, 57).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(1.1F, 11.0F, -2.0F);
		leftBoot.addChild(cube_r6);
		setRotationAngle(cube_r6, 2.3562F, 1.2654F, 1.5708F);
		cube_r6.texOffs(1, 57).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);

		RightLeg_r2 = new ModelRenderer(this);
		RightLeg_r2.setPos(0.0F, 11.5F, -3.0F);
		leftBoot.addChild(RightLeg_r2);
		setRotationAngle(RightLeg_r2, 0.0873F, 0.0F, 0.0F);
		RightLeg_r2.texOffs(0, 32).addBox(-2.5F, -1.0F, -0.35F, 5.0F, 2.0F, 1.0F, 0.0F, true);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		rightBoot.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftBoot.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}