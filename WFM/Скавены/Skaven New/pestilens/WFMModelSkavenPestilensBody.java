// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelSkavenPestilensBody extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer spike4_r1;
	private final ModelRenderer spike3_r1;
	private final ModelRenderer spike1_r1;
	private final ModelRenderer bell;
	private final ModelRenderer bell_r1;
	private final ModelRenderer leftArm;
	private final ModelRenderer spike4_r2;
	private final ModelRenderer spike4_r3;
	private final ModelRenderer rightArm;
	private final ModelRenderer spike1_r2;

	public WFMModelSkavenPestilensBody() {
		texWidth = 64;
		texHeight = 64;

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 7.0F, -2.0F);
		setRotationAngle(Body, 0.3927F, 0.0F, 0.0F);
		Body.texOffs(16, 13).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.5F, false);
		Body.texOffs(16, 29).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.8F, false);

		spike4_r1 = new ModelRenderer(this);
		spike4_r1.setPos(0.4828F, -4.2367F, 3.7844F);
		Body.addChild(spike4_r1);
		setRotationAngle(spike4_r1, 1.3789F, -0.5851F, 0.2624F);
		spike4_r1.texOffs(56, 21).addBox(1.4181F, -5.7784F, 2.0016F, 0.0F, 4.0F, 4.0F, 0.0F, false);

		spike3_r1 = new ModelRenderer(this);
		spike3_r1.setPos(0.0F, -0.5412F, 2.3066F);
		Body.addChild(spike3_r1);
		setRotationAngle(spike3_r1, 0.0F, 0.2182F, 0.0F);
		spike3_r1.texOffs(56, 15).addBox(1.1277F, -5.6955F, -0.2362F, 0.0F, 4.0F, 4.0F, 0.0F, false);
		spike3_r1.texOffs(56, 15).addBox(0.2485F, 0.6131F, -0.8904F, 0.0F, 4.0F, 4.0F, 0.0F, false);

		spike1_r1 = new ModelRenderer(this);
		spike1_r1.setPos(0.0F, -0.5412F, 2.3066F);
		Body.addChild(spike1_r1);
		setRotationAngle(spike1_r1, 0.0F, -0.2618F, 0.0F);
		spike1_r1.texOffs(56, 10).addBox(-1.8328F, -3.0824F, 1.1177F, 0.0F, 4.0F, 4.0F, 0.0F, false);

		bell = new ModelRenderer(this);
		bell.setPos(0.0F, -1.8118F, -2.8308F);
		Body.addChild(bell);
		setRotationAngle(bell, -0.3054F, 0.0F, 0.0F);
		

		bell_r1 = new ModelRenderer(this);
		bell_r1.setPos(0.0F, 0.6598F, -0.5585F);
		bell.addChild(bell_r1);
		setRotationAngle(bell_r1, -0.3927F, 0.0F, 0.0F);
		bell_r1.texOffs(48, 8).addBox(-2.0F, 4.0F, -1.889F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		bell_r1.texOffs(52, 2).addBox(-1.5F, 1.0F, -1.389F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		bell_r1.texOffs(58, 0).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(4.0F, 4.0F, -4.0F);
		leftArm.texOffs(40, 15).addBox(0.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.49F, false);
		leftArm.texOffs(40, 38).addBox(0.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.69F, false);
		leftArm.texOffs(40, 25).addBox(0.0F, 3.0F, -2.0F, 4.0F, 9.0F, 4.0F, -0.1F, false);
		leftArm.texOffs(42, 48).addBox(0.0F, 3.0F, -2.0F, 4.0F, 9.0F, 4.0F, 0.29F, false);

		spike4_r2 = new ModelRenderer(this);
		spike4_r2.setPos(3.4014F, 6.6671F, -1.8961F);
		leftArm.addChild(spike4_r2);
		setRotationAngle(spike4_r2, -2.427F, 0.3305F, -1.4208F);
		spike4_r2.texOffs(56, 21).addBox(0.0F, -2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 0.0F, false);

		spike4_r3 = new ModelRenderer(this);
		spike4_r3.setPos(7.4014F, 2.3931F, 1.0504F);
		leftArm.addChild(spike4_r3);
		setRotationAngle(spike4_r3, 1.3789F, -0.5851F, 1.2223F);
		spike4_r3.texOffs(56, 21).addBox(0.6837F, -3.078F, -6.0461F, 0.0F, 4.0F, 4.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-4.0F, 4.0F, -4.0F);
		rightArm.texOffs(40, 15).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.49F, true);
		rightArm.texOffs(40, 25).addBox(-4.0F, 3.0F, -2.0F, 4.0F, 9.0F, 4.0F, -0.1F, true);
		rightArm.texOffs(40, 38).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.69F, true);
		rightArm.texOffs(42, 48).addBox(-4.0F, 3.0F, -2.0F, 4.0F, 9.0F, 4.0F, 0.29F, true);

		spike1_r2 = new ModelRenderer(this);
		spike1_r2.setPos(-2.0F, 7.4588F, 0.3066F);
		rightArm.addChild(spike1_r2);
		setRotationAngle(spike1_r2, -1.1362F, -1.0861F, 1.0877F);
		spike1_r2.texOffs(56, 10).addBox(-1.8328F, -3.0824F, 1.1177F, 0.0F, 4.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}