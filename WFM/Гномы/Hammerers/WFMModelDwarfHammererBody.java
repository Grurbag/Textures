// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelDwarfHammererBody extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer diamond6;
	private final ModelRenderer diamond_r1;
	private final ModelRenderer leftArm;
	private final ModelRenderer shoulder_left;
	private final ModelRenderer diamond5;
	private final ModelRenderer diamond_r2;
	private final ModelRenderer diamond2;
	private final ModelRenderer diamond_r3;
	private final ModelRenderer rightArm;
	private final ModelRenderer shoulder_right;
	private final ModelRenderer diamond4;
	private final ModelRenderer diamond_r4;
	private final ModelRenderer diamond3;
	private final ModelRenderer diamond_r5;

	public WFMModelDwarfHammererBody() {
		texWidth = 64;
		texHeight = 64;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 0.0F, 0.0F);
		body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.5F, false);
		body.texOffs(16, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.8F, false);

		diamond6 = new ModelRenderer(this);
		diamond6.setPos(0.0F, 10.0F, -2.0F);
		body.addChild(diamond6);
		

		diamond_r1 = new ModelRenderer(this);
		diamond_r1.setPos(0.0F, 0.0F, 0.0F);
		diamond6.addChild(diamond_r1);
		setRotationAngle(diamond_r1, 0.0F, 0.0F, -0.7854F);
		diamond_r1.texOffs(26, 42).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.3F, false);
		diamond_r1.texOffs(26, 38).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(5.0F, 2.0F, 0.0F);
		leftArm.texOffs(40, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, true);
		leftArm.texOffs(0, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, false);

		shoulder_left = new ModelRenderer(this);
		shoulder_left.setPos(1.0F, -0.5F, 0.0F);
		leftArm.addChild(shoulder_left);
		setRotationAngle(shoulder_left, 0.0F, 0.0F, 0.1309F);
		shoulder_left.texOffs(0, 52).addBox(-2.75F, -2.5F, -3.5F, 6.0F, 5.0F, 7.0F, 0.1F, true);
		shoulder_left.texOffs(0, 33).addBox(-2.75F, -2.5F, -3.5F, 6.0F, 5.0F, 7.0F, -0.15F, true);

		diamond5 = new ModelRenderer(this);
		diamond5.setPos(3.0F, -0.5F, 0.0F);
		shoulder_left.addChild(diamond5);
		setRotationAngle(diamond5, 0.0F, -1.5708F, 0.0F);
		

		diamond_r2 = new ModelRenderer(this);
		diamond_r2.setPos(0.0F, 0.0F, 0.0F);
		diamond5.addChild(diamond_r2);
		setRotationAngle(diamond_r2, 0.0F, 0.0F, -0.7854F);
		diamond_r2.texOffs(26, 42).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.3F, false);
		diamond_r2.texOffs(26, 38).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		diamond2 = new ModelRenderer(this);
		diamond2.setPos(3.0F, 7.0F, 0.0F);
		leftArm.addChild(diamond2);
		setRotationAngle(diamond2, 0.0F, -1.5708F, 0.0F);
		

		diamond_r3 = new ModelRenderer(this);
		diamond_r3.setPos(0.0F, 0.0F, 0.0F);
		diamond2.addChild(diamond_r3);
		setRotationAngle(diamond_r3, 0.0F, 0.0F, -0.7854F);
		diamond_r3.texOffs(26, 42).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.3F, false);
		diamond_r3.texOffs(26, 38).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-5.0F, 2.0F, 0.0F);
		rightArm.texOffs(40, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, false);
		rightArm.texOffs(0, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, true);

		shoulder_right = new ModelRenderer(this);
		shoulder_right.setPos(-1.0F, -0.5F, 0.0F);
		rightArm.addChild(shoulder_right);
		setRotationAngle(shoulder_right, 0.0F, 0.0F, -0.1309F);
		shoulder_right.texOffs(0, 33).addBox(-3.25F, -2.5F, -3.5F, 6.0F, 5.0F, 7.0F, -0.15F, false);
		shoulder_right.texOffs(0, 52).addBox(-3.25F, -2.5F, -3.5F, 6.0F, 5.0F, 7.0F, 0.1F, false);

		diamond4 = new ModelRenderer(this);
		diamond4.setPos(-3.0F, -0.5F, 0.0F);
		shoulder_right.addChild(diamond4);
		setRotationAngle(diamond4, 0.0F, 1.5708F, 0.0F);
		

		diamond_r4 = new ModelRenderer(this);
		diamond_r4.setPos(0.0F, 0.0F, 0.0F);
		diamond4.addChild(diamond_r4);
		setRotationAngle(diamond_r4, 0.0F, 0.0F, -0.7854F);
		diamond_r4.texOffs(26, 42).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.3F, false);
		diamond_r4.texOffs(26, 38).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		diamond3 = new ModelRenderer(this);
		diamond3.setPos(-3.0F, 7.0F, 0.0F);
		rightArm.addChild(diamond3);
		setRotationAngle(diamond3, 0.0F, 1.5708F, 0.0F);
		

		diamond_r5 = new ModelRenderer(this);
		diamond_r5.setPos(0.0F, 0.0F, 0.0F);
		diamond3.addChild(diamond_r5);
		setRotationAngle(diamond_r5, 0.0F, 0.0F, -0.7854F);
		diamond_r5.texOffs(26, 42).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.3F, false);
		diamond_r5.texOffs(26, 38).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
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