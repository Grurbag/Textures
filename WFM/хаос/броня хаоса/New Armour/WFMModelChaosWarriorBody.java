// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelChaosWarriorBody extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer shkura;
	private final ModelRenderer shkura2;
	private final ModelRenderer cape;
	private final ModelRenderer RightArm;
	private final ModelRenderer nalokotnik;
	private final ModelRenderer nalokotnik_r1;
	private final ModelRenderer shoulderRight;
	private final ModelRenderer LeftArm_r1;
	private final ModelRenderer LeftArm;
	private final ModelRenderer shoulderLeft;
	private final ModelRenderer RightArm_r1;
	private final ModelRenderer nalokotnik2;
	private final ModelRenderer nalokotnik_r2;

	public WFMModelChaosWarriorBody() {
		texWidth = 64;
		texHeight = 64;

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		Body.texOffs(19, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.5F, false);
		Body.texOffs(16, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.8F, false);
		Body.texOffs(46, 0).addBox(-4.5F, 3.0F, -2.7F, 9.0F, 10.0F, 0.0F, 0.0F, false);

		shkura = new ModelRenderer(this);
		shkura.setPos(-3.0F, 2.0F, 5.0F);
		Body.addChild(shkura);
		shkura.texOffs(0, 14).addBox(-4.0F, -3.0F, -1.0F, 7.0F, 3.0F, 2.0F, 0.0F, false);

		shkura2 = new ModelRenderer(this);
		shkura2.setPos(4.0F, 2.0F, 5.0F);
		Body.addChild(shkura2);
		shkura2.texOffs(0, 14).addBox(-4.0F, -3.0F, -1.0F, 7.0F, 3.0F, 2.0F, 0.0F, true);

		cape = new ModelRenderer(this);
		cape.setPos(0.0F, 0.0F, 0.0F);
		Body.addChild(cape);
		cape.texOffs(0, 40).addBox(-7.0F, 0.0F, 5.0F, 14.0F, 24.0F, 0.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setPos(-5.0F, 2.0F, 0.0F);
		RightArm.texOffs(46, 16).addBox(-4.0F, -2.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.49F, true);
		RightArm.texOffs(0, 19).addBox(-4.0F, -2.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.69F, true);

		nalokotnik = new ModelRenderer(this);
		nalokotnik.setPos(-3.0F, 5.0F, 0.0F);
		RightArm.addChild(nalokotnik);
		

		nalokotnik_r1 = new ModelRenderer(this);
		nalokotnik_r1.setPos(0.0F, 0.0F, 0.0F);
		nalokotnik.addChild(nalokotnik_r1);
		setRotationAngle(nalokotnik_r1, 0.0F, 0.0F, 0.7854F);
		nalokotnik_r1.texOffs(0, 0).addBox(-2.0F, 0.0F, -2.5F, 2.0F, 2.0F, 5.0F, 0.69F, true);

		shoulderRight = new ModelRenderer(this);
		shoulderRight.setPos(1.0F, 0.0F, 0.0F);
		RightArm.addChild(shoulderRight);
		

		LeftArm_r1 = new ModelRenderer(this);
		LeftArm_r1.setPos(-3.2479F, -0.4674F, 0.0F);
		shoulderRight.addChild(LeftArm_r1);
		setRotationAngle(LeftArm_r1, 0.0F, 0.0F, -0.1309F);
		LeftArm_r1.texOffs(34, 36).addBox(-4.0F, -3.5F, -4.0F, 7.0F, 6.0F, 8.0F, 0.1F, true);
		LeftArm_r1.texOffs(34, 50).addBox(-4.0F, -3.5F, -4.0F, 7.0F, 6.0F, 8.0F, 0.3F, true);

		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(5.0F, 2.0F, 0.0F);
		LeftArm.texOffs(46, 16).addBox(-1.0F, -2.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.49F, false);
		LeftArm.texOffs(0, 19).addBox(-1.0F, -2.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.69F, false);

		shoulderLeft = new ModelRenderer(this);
		shoulderLeft.setPos(-1.0F, 0.0F, 0.0F);
		LeftArm.addChild(shoulderLeft);
		

		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setPos(3.0F, -0.5F, 0.0F);
		shoulderLeft.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, 0.0F, 0.0F, 0.1309F);
		RightArm_r1.texOffs(34, 36).addBox(-2.75F, -3.5F, -4.0F, 7.0F, 6.0F, 8.0F, 0.1F, false);
		RightArm_r1.texOffs(34, 50).addBox(-2.75F, -3.5F, -4.0F, 7.0F, 6.0F, 8.0F, 0.3F, false);

		nalokotnik2 = new ModelRenderer(this);
		nalokotnik2.setPos(4.5858F, 5.0F, 0.0F);
		LeftArm.addChild(nalokotnik2);
		setRotationAngle(nalokotnik2, 0.0F, 0.0F, -1.5708F);
		

		nalokotnik_r2 = new ModelRenderer(this);
		nalokotnik_r2.setPos(1.4142F, 0.0F, 0.0F);
		nalokotnik2.addChild(nalokotnik_r2);
		setRotationAngle(nalokotnik_r2, 0.0F, 0.0F, 0.7854F);
		nalokotnik_r2.texOffs(0, 0).addBox(-2.0F, 0.0F, -2.5F, 2.0F, 2.0F, 5.0F, 0.69F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}