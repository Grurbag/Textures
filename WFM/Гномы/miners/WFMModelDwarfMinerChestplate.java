// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelDwarfMinerChestplate extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer backpack;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer belt;
	private final ModelRenderer leftArm;
	private final ModelRenderer shoulder_left;
	private final ModelRenderer rightArm;
	private final ModelRenderer shoulder_right;

	public WFMModelDwarfMinerChestplate() {
		texWidth = 64;
		texHeight = 64;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 12.0F, 0.0F);
		body.texOffs(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.5F, false);
		body.texOffs(16, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.8F, false);

		backpack = new ModelRenderer(this);
		backpack.setPos(-0.25F, 2.0F, 4.1875F);
		body.addChild(backpack);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(-0.25F, 0.0F, 0.5625F);
		backpack.addChild(cube_r1);
		setRotationAngle(cube_r1, -3.1416F, 0.0F, 3.0543F);
		cube_r1.texOffs(38, 48).addBox(-1.2748F, -5.2936F, -1.5F, 9.0F, 4.0F, 4.0F, 0.0F, true);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(-0.25F, 0.0F, 0.5625F);
		backpack.addChild(cube_r2);
		setRotationAngle(cube_r2, 3.1416F, 0.0F, -3.0543F);
		cube_r2.texOffs(38, 48).addBox(-7.7252F, -5.2936F, -1.75F, 9.0F, 4.0F, 4.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(-0.25F, 0.0F, 0.0625F);
		backpack.addChild(cube_r3);
		setRotationAngle(cube_r3, -3.1416F, 0.0F, 3.1416F);
		cube_r3.texOffs(38, 32).addBox(-4.0F, -3.0F, -2.5F, 9.0F, 12.0F, 4.0F, 0.3F, false);
		cube_r3.texOffs(38, 48).addBox(-4.0F, -3.0F, -2.5F, 9.0F, 12.0F, 4.0F, 0.0F, false);

		belt = new ModelRenderer(this);
		belt.setPos(0.0F, 12.0F, 3.0F);
		body.addChild(belt);
		

		leftArm = new ModelRenderer(this);
		leftArm.setPos(6.0F, 14.0F, 0.0F);
		leftArm.texOffs(40, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.89F, true);
		leftArm.texOffs(0, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.09F, true);

		shoulder_left = new ModelRenderer(this);
		shoulder_left.setPos(1.5F, -1.0F, 0.0F);
		leftArm.addChild(shoulder_left);
		setRotationAngle(shoulder_left, 0.0F, 0.0F, 0.0F);
		shoulder_left.texOffs(0, 52).addBox(-2.75F, -2.5F, -3.5F, 6.0F, 5.0F, 7.0F, 0.5F, true);
		shoulder_left.texOffs(14, 40).addBox(-2.75F, -2.5F, -3.5F, 5.0F, 5.0F, 7.0F, 0.3F, true);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-6.0F, 14.0F, 0.0F);
		rightArm.texOffs(40, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.89F, false);
		rightArm.texOffs(0, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.09F, false);

		shoulder_right = new ModelRenderer(this);
		shoulder_right.setPos(-2.25F, -1.25F, 0.0F);
		rightArm.addChild(shoulder_right);
		setRotationAngle(shoulder_right, 0.0F, 0.0F, 0.0F);
		shoulder_right.texOffs(14, 40).addBox(-2.25F, -2.5F, -3.5F, 5.0F, 5.0F, 7.0F, 0.3F, false);
		shoulder_right.texOffs(0, 52).addBox(-3.25F, -2.5F, -3.5F, 6.0F, 5.0F, 7.0F, 0.5F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}