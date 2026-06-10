// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelSlaaneshBody extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer cape_r1;
	private final ModelRenderer RightArm;
	private final ModelRenderer spike_r1;
	private final ModelRenderer Naplechnik3_r1;
	private final ModelRenderer LeftArm_r1;
	private final ModelRenderer LeftArm_r2;
	private final ModelRenderer nalokotnik_r1;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm_r1;
	private final ModelRenderer spike_r2;
	private final ModelRenderer nalokotnik_r2;
	private final ModelRenderer RightArm_r2;

	public WFMModelSlaaneshBody() {
		texWidth = 80;
		texHeight = 64;

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		Body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.5F, false);
		Body.texOffs(16, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.8F, false);

		cape_r1 = new ModelRenderer(this);
		cape_r1.setPos(0.0F, 0.0F, 6.0F);
		Body.addChild(cape_r1);
		setRotationAngle(cape_r1, 0.1745F, 0.0F, 0.0F);
		cape_r1.texOffs(18, 40).addBox(-7.0F, 0.0F, -1.0F, 14.0F, 24.0F, 0.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setPos(-5.0F, 2.0F, 0.0F);
		RightArm.texOffs(40, 16).addBox(-4.0F, -2.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.49F, true);
		RightArm.texOffs(0, 48).addBox(-4.0F, -2.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.69F, true);
		RightArm.texOffs(0, 8).addBox(-2.75F, -1.0F, -4.5F, 5.0F, 5.0F, 0.0F, 0.0F, true);
		RightArm.texOffs(0, 13).addBox(-2.75F, -2.0F, 4.5F, 5.0F, 11.0F, 0.0F, 0.0F, true);

		spike_r1 = new ModelRenderer(this);
		spike_r1.setPos(9.0F, 1.5F, 9.0F);
		RightArm.addChild(spike_r1);
		setRotationAngle(spike_r1, 0.0F, 0.0F, -0.1309F);
		spike_r1.texOffs(70, 0).addBox(-16.25F, -12.5F, -9.5F, 5.0F, 6.0F, 0.0F, 0.0F, true);

		Naplechnik3_r1 = new ModelRenderer(this);
		Naplechnik3_r1.setPos(13.0F, -0.5F, 0.0F);
		RightArm.addChild(Naplechnik3_r1);
		setRotationAngle(Naplechnik3_r1, 0.0F, 0.0F, -0.1309F);
		Naplechnik3_r1.texOffs(11, 36).addBox(-14.5F, -7.5F, 4.0F, 1.0F, 5.0F, 2.0F, 0.0F, true);
		Naplechnik3_r1.texOffs(0, 36).addBox(-14.5F, -7.5F, -6.0F, 1.0F, 5.0F, 2.0F, 0.0F, true);
		Naplechnik3_r1.texOffs(0, 36).addBox(-14.5F, -9.5F, -4.0F, 1.0F, 4.0F, 8.0F, 0.0F, true);

		LeftArm_r1 = new ModelRenderer(this);
		LeftArm_r1.setPos(-3.2479F, -0.4674F, 0.0F);
		RightArm.addChild(LeftArm_r1);
		setRotationAngle(LeftArm_r1, 0.0F, 0.0F, -0.1309F);
		LeftArm_r1.texOffs(50, 36).addBox(-4.0F, -3.5F, -4.0F, 7.0F, 6.0F, 8.0F, 0.1F, true);
		LeftArm_r1.texOffs(50, 50).addBox(-4.0F, -3.5F, -4.0F, 7.0F, 6.0F, 8.0F, 0.3F, true);

		LeftArm_r2 = new ModelRenderer(this);
		LeftArm_r2.setPos(-2.1061F, 0.81F, 0.0F);
		RightArm.addChild(LeftArm_r2);
		setRotationAngle(LeftArm_r2, 0.0F, 0.0F, -0.0436F);
		LeftArm_r2.texOffs(40, 0).addBox(-3.0F, -3.5F, -3.0F, 6.0F, 7.0F, 6.0F, -0.15F, true);

		nalokotnik_r1 = new ModelRenderer(this);
		nalokotnik_r1.setPos(-3.0F, 6.0F, 0.0F);
		RightArm.addChild(nalokotnik_r1);
		setRotationAngle(nalokotnik_r1, 0.0F, 0.0F, 0.7854F);
		nalokotnik_r1.texOffs(0, 0).addBox(-2.0F, 0.0F, -2.5F, 2.0F, 2.0F, 5.0F, 0.69F, true);

		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(5.0F, 2.0F, 0.0F);
		LeftArm.texOffs(40, 16).addBox(-1.0F, -2.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.49F, false);
		LeftArm.texOffs(0, 48).addBox(-1.0F, -2.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.69F, false);
		LeftArm.texOffs(0, 24).addBox(-2.75F, -1.0F, -4.5F, 7.0F, 8.0F, 0.0F, 0.0F, false);
		LeftArm.texOffs(0, 13).addBox(-1.75F, -2.0F, 4.5F, 5.0F, 11.0F, 0.0F, 0.0F, false);

		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setPos(3.0F, -0.5F, 0.0F);
		LeftArm.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, 0.0F, 0.0F, 0.1309F);
		RightArm_r1.texOffs(50, 36).addBox(-2.75F, -3.5F, -4.0F, 7.0F, 6.0F, 8.0F, 0.1F, false);
		RightArm_r1.texOffs(11, 36).addBox(-2.5F, -5.5F, 4.0F, 1.0F, 5.0F, 2.0F, 0.0F, false);
		RightArm_r1.texOffs(0, 36).addBox(-2.5F, -5.5F, -6.0F, 1.0F, 5.0F, 2.0F, 0.0F, false);
		RightArm_r1.texOffs(0, 36).addBox(-2.5F, -7.5F, -4.0F, 1.0F, 4.0F, 8.0F, 0.0F, false);
		RightArm_r1.texOffs(50, 50).addBox(-2.75F, -3.5F, -4.0F, 7.0F, 6.0F, 8.0F, 0.3F, false);

		spike_r2 = new ModelRenderer(this);
		spike_r2.setPos(-1.0F, 1.5F, 9.0F);
		LeftArm.addChild(spike_r2);
		setRotationAngle(spike_r2, 0.0F, 0.0F, 0.1309F);
		spike_r2.texOffs(70, 0).addBox(3.25F, -11.5F, -9.5F, 5.0F, 6.0F, 0.0F, 0.0F, false);

		nalokotnik_r2 = new ModelRenderer(this);
		nalokotnik_r2.setPos(4.0F, 6.0F, 0.0F);
		LeftArm.addChild(nalokotnik_r2);
		setRotationAngle(nalokotnik_r2, 0.0F, 0.0F, 0.7854F);
		nalokotnik_r2.texOffs(0, 0).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, 0.69F, false);

		RightArm_r2 = new ModelRenderer(this);
		RightArm_r2.setPos(2.1061F, 0.81F, 0.0F);
		LeftArm.addChild(RightArm_r2);
		setRotationAngle(RightArm_r2, 0.0F, 0.0F, 0.0436F);
		RightArm_r2.texOffs(40, 0).addBox(-3.0F, -3.5F, -3.0F, 6.0F, 7.0F, 6.0F, -0.15F, false);
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